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
@Table(name = "book_inventory")

public class BookInventory {
	
		@Id
		@GeneratedValue
		@Column(name = "inventory_id")
		private int inventoryId;

		@Column(name = "quantity")
		private int quantity;

		@ManyToOne
		@JoinColumn(name = "isbn")
		private Book book;

		@ManyToOne
		@JoinColumn(name = "id")
		private User user;
}
