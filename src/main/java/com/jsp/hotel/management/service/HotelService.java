package com.jsp.hotel.management.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.hotel.management.dao.HotelDao;
import com.jsp.hotel.management.dto.Hotel;
import com.jsp.hotel.management.dto.Room;



public class HotelService {
	HotelDao hotelDao = new HotelDao();
	RoomService roomService = new RoomService();

	public void create(Hotel hotel) {
		hotelDao.create(hotel);
	}

	public void update(Hotel hotel) {
		hotelDao.update(hotel);
	}

	public void delete(int id) {
		Hotel hotel2 = hotelDao.readHotelById(id);
		for (Room room : hotel2.getRoom()) {
			roomService.deleteById(room.getRoom_id());
		}
		hotelDao.delete(id);
	}

	public Hotel readById(int id) {
		return hotelDao.readHotelById(id);
	}

	public List<Hotel> readAllHotel() {
		List<Hotel> properties = new ArrayList<Hotel>();
		for (Hotel hotel : hotelDao.readAllHotel()) {
			if (hotel.getLandLord() != null) {
				properties.add(hotel);
			}
		}
		return properties;
	}

	public void addRoomsByHotelId(int id, Hotel hotel) {
		Hotel hotel2 = hotelDao.readHotelById(hotel.getHotel_id());
		if (hotel2.getLandLord() != null) {
			Room room = roomService.readById(id);
			room.setHotel(hotel);

			ArrayList<Room> rooms = new ArrayList<Room>();
			rooms.add(room);

			hotel.setRoom(rooms);

			hotelDao.update(hotel);
			roomService.update(room);
		} else {
			System.out.println("Hotel Is Not Approved");
		}
	}

	public List<Room> readAllRoomsByHotelId(int id) {
		return roomService.readAllRoomByHotelId(id);
	}


}
