package com.srinu.chaitanya.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(name = "total_amount")
	private double totalAmount;

	@Column(name = "status")
	private String status;
	
	@OneToMany(mappedBy = "order", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@Column(name = "order_date")
	private LocalDateTime orderedDate;
	
	@Column(name = "cancelled_date")
	private LocalDate cancelledDate;
}
