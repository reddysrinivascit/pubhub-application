package com.srinu.chaitanya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "book_ratings")

public class BookRatings {
	
	@Id
	@GeneratedValue
	@Column(name = "ratings_id")
	private int ratingsId;

	@Column(name = "rating")
	private double rating;

	@ManyToOne
	@JoinColumn(name = "isbn")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;
}

