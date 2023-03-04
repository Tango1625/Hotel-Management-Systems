package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Admin;
import com.jsp.hotel.management.service.AdminService;

public class TestSaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("MR PRATHAM");
		admin.setEmail_id("PRATHAM@GMAIL.COM");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
