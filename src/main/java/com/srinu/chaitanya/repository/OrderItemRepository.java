package com.srinu.chaitanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinu.chaitanya.model.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
