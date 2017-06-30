package com.srinu.chaitanya.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItems {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Column(name = "quantity")
	private Integer quantity;
	@ManyToOne(fetch = FetchType.LAZY)

	@JoinColumn(name = "book_id")
	// @Column(name="book_id")
	private Book book;
}
