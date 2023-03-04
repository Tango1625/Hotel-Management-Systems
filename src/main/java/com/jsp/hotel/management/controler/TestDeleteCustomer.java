package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.service.CustomerService;

public class TestDeleteCustomer {
	public static void main(String[] args) {
		int customer_id = 1;
		CustomerService customerService = new CustomerService();
		customerService.delete(customer_id);

	}
}
