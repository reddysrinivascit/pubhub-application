package com.srinu.chaitanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinu.chaitanya.model.Book;



public interface BookRepository extends JpaRepository<Book, Long>{

}
