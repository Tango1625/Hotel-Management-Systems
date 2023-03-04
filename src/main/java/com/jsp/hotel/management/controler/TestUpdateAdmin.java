package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Admin;
import com.jsp.hotel.management.service.AdminService;

public class TestUpdateAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		admin.setAdmin_name("TANGO");
		
		
		AdminService adminService = new AdminService();
		adminService.update(admin);
	}
}
