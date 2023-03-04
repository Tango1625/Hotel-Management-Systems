package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Customer;
import com.jsp.hotel.management.service.CustomerService;

public class TestUpdateCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_id(1);
		customer.setCustomer_name("RAJAN");

		CustomerService customerService = new CustomerService();
		customerService.update(customer);
	}
}
