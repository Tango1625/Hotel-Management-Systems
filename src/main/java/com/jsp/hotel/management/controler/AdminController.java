package com.jsp.hotel.management.controler;

import java.util.ArrayList;

import com.jsp.hotel.management.dto.Admin;
import com.jsp.hotel.management.dto.LandLord;
import com.jsp.hotel.management.service.AdminService;
import com.jsp.hotel.management.service.LandlordService;


public class AdminController {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("MR PRATHMESH");
		admin.setEmail_id("PRATHAM@GMAIL.COM");

		LandLord landLord = new LandLord();
		landLord.setName("MR ADVAITH");
		landLord.setAddress("PANVEL");
		landLord.setAdmin(admin);
		LandLord landLord1 = new LandLord();
		landLord1.setName("MR AKSHAY");
		landLord1.setAddress("TALOJA");
		landLord1.setAdmin(admin);
		LandLord landLord2 = new LandLord();
		landLord2.setName("MR SAURABH");
		landLord2.setAddress("THANE");
		landLord2.setAdmin(admin);

		ArrayList<LandLord> landLords = new ArrayList<LandLord>();
		landLords.add(landLord);
		landLords.add(landLord1);
		landLords.add(landLord2);

		admin.setLandLords(landLords);

		AdminService adminService = new AdminService();
		adminService.create(admin);

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		System.out.println("");

	}
}
