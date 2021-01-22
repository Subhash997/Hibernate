package com.xworkz.DAO;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.singleconn.SingleSessionFactory;
import com.xworkz.DTO.Car;




public class CarMDAOImpl implements CarDAO {


	public void insertCar(Car car) {
		// TODO Auto-generated method stub
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = SingleSessionFactory.getSingleFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(car);
			session.getTransaction().commit();
			System.out.println("data saved successfully");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(car)) {
				session.close();
				System.out.println("session closed successfully");
			} else {
				System.out.println("session not closed successfully");
			}
			if (Objects.nonNull(sessionFactory)) {
				System.out.println("sessionFactory is closed sucessfully");
			} else {
				System.out.println("sessionFactory is not closed sucessfully");
			}

	}

	}
}
