package com.srinu.chaitanya.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@Column(name = "isbn")
	private long isbn;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "publish_date")
	private LocalDate publishDate;

	@Column(name = "content")
	private String content;

	@Column(name = "price")
	private double price;

	@Column(name = "status")
	private String status;
	
	@Column(name = "image_url")
	private String imageUrl;
}
