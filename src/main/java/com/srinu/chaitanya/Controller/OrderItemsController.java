package com.srinu.chaitanya.Controller;

import java.util.List;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.srinu.chaitanya.Model.Book;
import com.srinu.chaitanya.Model.OrderItems;
import com.srinu.chaitanya.Model.Orders;
import com.srinu.chaitanya.Model.User;
import com.srinu.chaitanya.Service.BookService;
@Controller
@RequestMapping("orderItems")
public class OrderItemsController
 {
@Autowired
private BookService bookService;
@PostMapping("/addToCart")
public String addToCart(@RequestParam("book_id") int isbn, @RequestParam("qty") Integer qty,
			HttpSession session) {
User user = (User) session.getAttribute("LOGGED_IN_USER");
Orders order = (Orders) session.getAttribute("MY_CART_ITEMS");

if (order == null)
 {
order = new Orders();
order.setUser(user);
order.setTotalPrice(0);
order.setStatus("ORDERED");
}
List<OrderItems> orderItems = order.getOrderItems();
boolean isItemExists = false;
		for (OrderItems item : orderItems) {

			if (item.getBook().getIsbn() == (isbn))
			{
	int totalQuantity = item.getQuantity() + qty;
		item.setQuantity(totalQuantity);
      isItemExists = true;
      }
		}

		if ( ! isItemExists)
		{
        OrderItems orderItem = new OrderItems();
		
        orderItem.setOrder(order);
      Book book = bookService.findOne(isbn);
     ((OrderItems) orderItems).setBook(book);
			orderItem.setQuantity(qty);
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
		Orders order = (Orders) session.getAttribute("MY_CART_ITEMS");

if (order != null && order.getOrderItems().size() > 0) {
			
 List<OrderItems> orderItems = order.getOrderItems();
			
OrderItems itemSelected = orderItems.get(id);
			
orderItems.remove(itemSelected);
			
order.setOrderItems(orderItems);
	
		session.setAttribute("MY_CART_ITEMS", order);
		}
return "redirect:../order/cart";
}
@GetMapping("/emptycart")
public String emptyCartid(HttpSession session) {
session.removeAttribute("MY_CART_ITEMS");
	return "redirect:../order/cart";
	}
}

