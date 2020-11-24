package de.aclue.demodependencyinjection02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsletterService {

	private final CustomerService customerService;
	
	/*
	 * @Autowired am Konstruktor kann weggelassen werden, daher funktioniert die Variante im OrderService analog zu dieser.
	 */
	@Autowired
	public NewsletterService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	public void sendNewsletter(Long customerId) {
		System.out.println("Newsletter: Hallo "+customerService.findCustomer(customerId));
	}
}
