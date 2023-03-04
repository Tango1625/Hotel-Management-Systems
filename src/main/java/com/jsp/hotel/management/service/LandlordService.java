package com.jsp.hotel.management.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.hotel.management.dao.LandLordDao;
import com.jsp.hotel.management.dto.Hotel;
import com.jsp.hotel.management.dto.LandLord;



public class LandlordService {
	LandLordDao landLordDao = new LandLordDao();
	HotelService hotelService = new HotelService();

	public void create(LandLord landLord) {
		landLord.setStatus("Not Approved");
		landLordDao.create(landLord);
	}

	public void update(LandLord landLord) {
		landLordDao.update(landLord);
	}

	public void delete(int id) {
		LandLord landLord = landLordDao.readById(id);
		for ( Hotel hotel : landLord.getHotels()) {
			hotelService.delete(hotel.getHotel_id());
		}
		landLordDao.delete(id);
	}

	public LandLord readById(int id) {
		return landLordDao.readById(id);
	}

	public List<LandLord> readAllLandlord() {
		return landLordDao.readAllLandlord();
	}

	public void addHotelById1(int id, LandLord landLord) {
		LandLord landLord1 = landLordDao.readById(landLord.getId());
		if (landLord1.getStatus().equalsIgnoreCase("APPROVED")) {
			Hotel hotel = hotelService.readById(id);
			hotel.setLandLord(landLord1);

			ArrayList<Hotel> hotels = new ArrayList<Hotel>();
			hotels.add(hotel);

			landLord1.setHotels(hotels);

			landLordDao.update(landLord1);
			hotelService.update(hotel);

		} else {
			System.out.println("LandLord is not approved");
		}
	}

	
}
