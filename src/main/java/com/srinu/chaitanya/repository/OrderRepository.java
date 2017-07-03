package com.srinu.chaitanya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinu.chaitanya.model.Order;



public interface OrderRepository extends JpaRepository<Order, Integer> {

	public List<Order> findByUserIdOrderByIdDesc(int userid);

	public List<Order> findByOrderByIdDesc();
}
