package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.dto.Room;
import com.jsp.hotel.management.service.RoomService;

public class TestUpdateRoom {
	public static void main(String[] args) {
		Room room= new Room();
		room.setRoom_id(1);
		room.setRoom_price(5000.00);
		
		RoomService roomService= new RoomService();
		roomService.update(room);
	}
}
