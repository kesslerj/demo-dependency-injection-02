package de.aclue.demodependencyinjection02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import de.aclue.demodependencyinjection02.model.Order;
import de.aclue.demodependencyinjection02.service.NewsletterService;
import de.aclue.demodependencyinjection02.service.OrderService;

@SpringBootApplication
public class DemoDependencyInjection02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoDependencyInjection02Application.class, args);
		
		OrderService orderService = context.getBean(OrderService.class);
		long customerId = 123l;
		Order order = orderService.createOrder("3 Bananen", 123L);
		System.out.println(order);
		
		NewsletterService newsletterService = context.getBean(NewsletterService.class);
		newsletterService.sendNewsletter(customerId);
	}

}
