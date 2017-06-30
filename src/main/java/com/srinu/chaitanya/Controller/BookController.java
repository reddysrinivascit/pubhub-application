package com.srinu.chaitanya.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.srinu.chaitanya.Model.Book;
import com.srinu.chaitanya.Service.BookService;

@Controller
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/list")
	public String ListBook(ModelMap modelmap){
		System.out.println("show book deatils");
		List<Book> book=null;
		book = bookservice.findAll();
		modelmap.addAttribute("book",book);
		return "Book/Book";
	}
	@GetMapping("/{isbn}")
	public String viewDeatils(@PathVariable("isbn") int isbn, ModelMap modelmap){
		
		Book book = bookservice.findOne(isbn);
		modelmap.addAttribute("book",book);
		return "Book/content1";
	}
	

	
	
		}