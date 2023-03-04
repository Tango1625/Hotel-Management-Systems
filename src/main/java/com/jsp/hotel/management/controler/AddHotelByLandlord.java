package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.LandLord;
import com.jsp.hotel.management.service.LandlordService;

public class AddHotelByLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setId(3);

		int property_id = 3;
		LandlordService landlordService = new LandlordService();
		landlordService.addHotelById1(property_id, landLord);

	}
}
