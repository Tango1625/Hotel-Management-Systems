package com.jsp.hotel.management.controler;

import java.util.List;

import com.jsp.hotel.management.dto.Customer;
import com.jsp.hotel.management.service.CustomerService;



public class TestReadAllCustomer {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
	List<Customer> customers=	customerService.readAllCustomer();
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomer_id());
			System.out.println(customer.getCustomer_name());
			System.out.println(customer.getCustomer_phnone_num());
			System.out.println(customer.getCustomer_aadhar_num());
			System.out.println();
		}

	}
}
