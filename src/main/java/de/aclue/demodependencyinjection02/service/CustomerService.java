package de.aclue.demodependencyinjection02.service;

import org.springframework.stereotype.Service;

import de.aclue.demodependencyinjection02.model.Customer;

@Service
public class CustomerService {

	public Customer findCustomer(Long id) {
		return new Customer("Kunde "+id);
	}
	
}
