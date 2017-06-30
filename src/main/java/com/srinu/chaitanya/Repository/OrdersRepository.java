package com.srinu.chaitanya.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.chaitanya.Model.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	public List<Orders> findByUserIdOrderByIdDesc(int userId);

	public List<Orders> findAllOrders();

	public List<Orders> findByUserIdOrderByIdDesc();

}
