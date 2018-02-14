package com.wisdom.spring.jdbc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wisdom.spring.jdbc.model.Address;
import com.wisdom.spring.jdbc.model.Customer;
import com.wisdom.spring.jdbc.service.CustomerManager;
import com.wisdom.spring.jdbc.service.CustomerManagerImpl;

public class TransactionManagerMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		CustomerManager customerManager = ctx.getBean("customerManager", CustomerManagerImpl.class);
		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);
		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Test Customer 2");
		Address address = new Address();
		address.setId(1);
		address.setCountry("Sri Lanka");
		// setting value more than 50 chars, so that SQLException occurs
		address.setAddress("Wisdom Academy of Information Technology, No:237/1/1, High Level Road, Maharagama");
		customer.setAddress(address);
		return customer;
	}
}