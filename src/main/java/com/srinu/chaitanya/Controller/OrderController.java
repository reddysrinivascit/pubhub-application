package com.srinu.chaitanya.Controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.srinu.chaitanya.Model.Orders;
import com.srinu.chaitanya.Model.User;
import com.srinu.chaitanya.Service.OrdersService;

@Controller
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	private OrdersService orderService;

	@GetMapping("/myorders")
	public String myOrders(ModelMap modelMap, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("LOGGED_IN_USER");

		List<Orders> list = orderService.findByUserIdOrderByIdDesc(loggedInUser.getId());
		modelMap.addAttribute("MY_ORDERS", list);
		return "order/myorders";
	}

	@GetMapping
	public String list(ModelMap modelMap, HttpSession session) {
		List<Orders> list = orderService.findAllOrders();
		System.out.println("orders:" + list.size());
		for (Orders order : list) {
			System.out.println(order);
		}
		modelMap.addAttribute("ORDERS_LIST", list);
		return "order/list";
	}

	@PostMapping("/save")
	public String save(@RequestParam("total_amount") Integer totalAmount, HttpSession session) {
		Orders orderInCart = (Orders) session.getAttribute("MY_CART_ITEMS");
		if (orderInCart != null && orderInCart.getOrderItems().size() > 0) {
			orderInCart.setTotalPrice(totalAmount);
			orderService.save(orderInCart);
			session.removeAttribute("MY_CART_ITEMS");
		}
		return "redirect:../order/myorders";
	}

	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("id") Integer orderId, @RequestParam("status") String status) {
		Orders order = orderService.findOne(orderId);
		if ("CANCELLED".equals(status)) {
			order.setCancelledDate(LocalDate.now());
		} else if ("DELIVERED".equals(status)) {
			order.setDeliveredDate(LocalDate.now());
		}
		order.setStatus(status);
		orderService.save(order);
		return "redirect:../order/myorders";
	}

	@GetMapping("/cart")
	public String cart() {
		return "order/cart";

	}

}
