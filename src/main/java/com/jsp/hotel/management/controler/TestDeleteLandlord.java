package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.service.LandlordService;

public class TestDeleteLandlord {
	public static void main(String[] args) {
		int landlord_id = 1;
		LandlordService landlordService = new LandlordService();
		landlordService.delete(landlord_id);
	}
}
