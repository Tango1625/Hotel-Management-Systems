package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.LandLord;
import com.jsp.hotel.management.service.LandlordService;

public class TestSaveLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setName("MR ADVEDH");
		landLord.setAddress("PANVEL");
		landLord.setStatus("approved");

		LandLord landLord1 = new LandLord();
		landLord1.setName("MR AKASHY");
		landLord1.setAddress("TALOJA");
		landLord.setStatus("approved");

		LandLord landLord2 = new LandLord();
		landLord2.setName("MR SAURABH");
		landLord2.setAddress("THANE");
		landLord.setStatus("approved");

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		
		
	}

}
