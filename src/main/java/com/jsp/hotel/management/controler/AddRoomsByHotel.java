package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Hotel;
import com.jsp.hotel.management.service.HotelService;

public class AddRoomsByHotel {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setHotel_id(3);

		int room_id=9;
		HotelService hotelService = new HotelService();
		hotelService.addRoomsByHotelId(room_id, hotel);
	}
}
