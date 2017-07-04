package com.srinu.chaitanya.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinu.chaitanya.model.Book;
import com.srinu.chaitanya.model.Order;
import com.srinu.chaitanya.model.OrderItem;
import com.srinu.chaitanya.model.User;
import com.srinu.chaitanya.service.BookService;


@Controller
@RequestMapping("orderItems")
public class OrderItemcontroller {

	@Autowired
	private BookService bookService;

	@PostMapping("/addToCart")
	public String addToCart(@RequestParam("book_id") long isbn, @RequestParam("qty") Integer Quantity,
			HttpSession session) {
		
		User user = (User) session.getAttribute("LOGGED_IN_USER");

		Order order = (Order) session.getAttribute("MY_CART_ITEMS");
		
		System.out.println(order);

		// create order
		if (order == null) {
			order = new Order();
			order.setUser(user);
			order.setTotalAmount(0);
			order.setStatus("ORDERED");
		}

		// store orderItems
		List<OrderItem> orderItems = order.getOrderItems();

		// If already the item is added to cart, then add the quantity

		boolean isItemExists = false;
		for (OrderItem item : orderItems) {

			if (item.getBook().getIsbn() ==(isbn)) {
				int totalQuantity = item.getQuantity() + Quantity;
				item.setQuantity(totalQuantity);
				isItemExists = true;
			}
		}

		//If item not exists, create new Item
		if ( ! isItemExists) {

			OrderItem orderItem = new OrderItem();
			orderItem.setOrder(order);

			Book book = bookService.findOne(isbn);
			orderItem.setBook(book);
			orderItem.setQuantity(Quantity);
			orderItems.add(orderItem);
		}

		order.setOrderItems(orderItems);

		session.setAttribute("MY_CART_ITEMS", order);

		return "redirect:../orders/cart";
	}

	@GetMapping("/list")
	public String list(HttpSession session) {
		return null;

	}

	@GetMapping("/remove")
	public String removeItemFromCart(@RequestParam("id") Integer id, HttpSession session) {

		System.out.println("Remove Item from Card:" + id);
		Order order = (Order) session.getAttribute("MY_CART_ITEMS");

		if (order != null && order.getOrderItems().size() > 0) {
			List<OrderItem> orderItems = order.getOrderItems();
			OrderItem itemSelected = orderItems.get(id);
			orderItems.remove(itemSelected);
			order.setOrderItems(orderItems);
			session.setAttribute("MY_CART_ITEMS", order);
		}

		return "redirect:../orders/cart";

	}
 
	@GetMapping("/emptycart")
	public String emptyCartid(HttpSession session) {

		session.removeAttribute("MY_CART_ITEMS");
		return "redirect:../orders/cart";

	}

}
