package com.jsp.hotel.management.controler;

import java.util.List;

import com.jsp.hotel.management.dto.LandLord;
import com.jsp.hotel.management.service.LandlordService;



public class TestReadAllLandlord {
	public static void main(String[] args) {
		LandlordService landlordService = new LandlordService();
		List<LandLord> landLord = landlordService.readAllLandlord();
		for (LandLord landLord2 : landLord) {
			System.out.println(landLord2.getId());
			System.out.println(landLord2.getName());
			System.out.println(landLord2.getAddress());
			System.out.println(landLord2.getStatus());
			System.out.println();
		}
	}
}
