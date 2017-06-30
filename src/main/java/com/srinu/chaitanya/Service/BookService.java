package com.srinu.chaitanya.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.chaitanya.Model.Book;
import com.srinu.chaitanya.Repository.BookRepository;

@Service
public class BookService {
@Autowired
public BookRepository bookRepository;

public List<Book> findAll(){
	return bookRepository.findAll();
	
}
public Book findOne(Integer isbn) {
	return bookRepository.findOne(isbn);
}
}
