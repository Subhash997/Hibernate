package com.hotel.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hotel.dto.HotelDTO;
import com.singleconn.SingleSessionFactory;

public class HotelDAOimpl implements HotelDAO {

	@Override
	public void insertHotel(HotelDTO hotelDto) {
		Session session=null;
		SessionFactory factory=null;
		try {
			factory=SingleSessionFactory.getSingleFactory();
			session=factory.openSession();
			session.beginTransaction();
			session.persist(hotelDto);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
