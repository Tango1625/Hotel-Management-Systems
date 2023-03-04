package com.jsp.hotel.management.controler;

import com.jsp.hotel.management.service.RoomService;

public class TestDeleteRoom {
	public static void main(String[] args) {
		int room_id=1;
		
		RoomService roomService= new RoomService();
		roomService.deleteById(room_id);
	}
}
