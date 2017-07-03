package com.srinu.chaitanya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_items")
public class OrderItem {

	@Id
	@GeneratedValue
	@Column(name = "items_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "orders_id")
	private Order order;

	@Column(name = "quantity")
	private Integer quantity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "book_isbn")
	private Book book;
}


