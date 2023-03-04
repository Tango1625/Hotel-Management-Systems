package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Customer;
import com.jsp.hotel.management.service.CustomerService;

public class TestReadCustomerById {
	public static void main(String[] args) {
		int customer_id = 1;
		CustomerService customerService = new CustomerService();
	Customer customer=	customerService.readById(customer_id);
	System.out.println(customer.getCustomer_id());
	System.out.println(customer.getCustomer_name());
	System.out.println(customer.getCustomer_phnone_num());
	System.out.println(customer.getCustomer_aadhar_num());
	}
}
