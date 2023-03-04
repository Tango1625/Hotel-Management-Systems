package com.jsp.hotel.management.controler;

import java.util.List;

import com.jsp.hotel.management.dto.Hotel;
import com.jsp.hotel.management.service.HotelService;

public class TestReadAllHotel {
	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		List<Hotel> hotels= hotelService.readAllHotel();

		for (Hotel hotel : hotels) {
			System.out.println(hotel.getHotel_id());
			System.out.println(hotel.getHotel_name());
			System.out.println("Location = "+hotel.getHotel_location());
			System.out.println("Number of Room = " + hotel.getNum_of_rooms());
			System.out.println("Hotel rating = " + hotel.getRating());
			System.out.println();
		}
	}
}
