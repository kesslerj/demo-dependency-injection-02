package de.aclue.demodependencyinjection02.service;

import org.springframework.stereotype.Service;

import de.aclue.demodependencyinjection02.model.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {
	
	private final CustomerService customerService;
	
	public Order createOrder(String content, Long userId) {
		return new Order(content, customerService.findCustomer(userId));
	}
	
}
