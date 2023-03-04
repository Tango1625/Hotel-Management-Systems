package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Room;
import com.jsp.hotel.management.service.RoomService;

public class TestReadRoomById {
	public static void main(String[] args) {
		int room_id = 2;

		RoomService roomService = new RoomService();

		Room room = roomService.readById(room_id);
		System.out.println(room.getRoom_id());
		System.out.println(room.getRoom_price());
		System.out.println(room.getRoom_status());
		System.out.println("Hotel id is " + room.getHotel());
		System.out.println("Customer id is " + room.getCustomer());
	}

}
