package com.jsp.hotel.management.controler;

import java.util.List;

import com.jsp.hotel.management.dto.Admin;
import com.jsp.hotel.management.service.AdminService;



public class TestReadAllAdmin {
	public static void main(String[] args) {
		AdminService adminService = new AdminService();

		List<Admin> admins = adminService.readAllAdmin();
		for (Admin admin : admins) {
			System.out.println(admin.getAdmin_id());
			System.out.println(admin.getAdmin_name());
			System.out.println(admin.getEmail_id());
			System.out.println();
		}

	}
}
