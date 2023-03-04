package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.LandLord;
import com.jsp.hotel.management.service.LandlordService;

public class TestUpdateLandlord {
public static void main(String[] args) {
	LandLord landLord= new LandLord();
	landLord.setId(2);
	landLord.setName("OMAKR");
	
	LandlordService landlordService= new LandlordService();
	landlordService.update(landLord);
}
}
