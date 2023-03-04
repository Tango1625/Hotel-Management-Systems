package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Admin;
import com.jsp.hotel.management.service.AdminService;

public class ApproveLandlord {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		
		int Landlord_id = 3;

		AdminService adminService = new AdminService();
		adminService.approveLandlordById(Landlord_id, admin);
	}

}
