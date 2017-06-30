package com.srinu.chaitanya.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.chaitanya.Model.Orders;
import com.srinu.chaitanya.Repository.OrdersRepository;

@Service

public class OrdersService {
	@Autowired
	private OrdersRepository ordersRepository;

	public void save(Orders orders) {
		ordersRepository.save(orders);
	}

	public List<Orders> findAllOrders() {

		return ordersRepository.findAllOrders();
	}

	public List<Orders> findAll() {
		return ordersRepository.findAll();
	}

	public Orders findOne(Integer id) {
		return ordersRepository.findOne(id);
	}

	public List<Orders> findByUserIdOrderByIdDesc(int i) {

		return ordersRepository.findByUserIdOrderByIdDesc();
	}
}