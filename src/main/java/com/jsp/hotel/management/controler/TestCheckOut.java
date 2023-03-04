package com.jsp.hotel.management.controler;

import java.util.ArrayList;

import com.jsp.hotel.management.dto.Room;
import com.jsp.hotel.management.service.CustomerService;



public class TestCheckOut {
	public static void main(String[] args) {
		int customer_id = 1;

		Room room = new Room();
		room.setRoom_id(1);

		Room room1 = new Room();
		room1.setRoom_id(2);

		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room);
		rooms.add(room1);

		CustomerService customerService = new CustomerService();
		customerService.checkOut(customer_id, rooms);
	}
}
