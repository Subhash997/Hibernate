package xworks.college.clgId;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import xworks.college.CollegeDTO;

public class clgDAOimpl implements clgDAO {

	@Override
	public void saveCollege(CollegeDTO collegeDTO) {
		// TODO Auto-generated method stub
		Session session = null;
		try {

			Configuration con = new Configuration();

			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			// session.save(college);
			session.persist(collegeDTO);
			session.getTransaction().commit();
			System.out.println("data saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(collegeDTO)) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}

	}

	@Override
	public void fetchCollege(int collegeID) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			Configuration con = new Configuration();
			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			CollegeDTO collage = session.get(CollegeDTO.class, collegeID);
			System.out.println(collage);

			System.out.println("Data is fetched");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}

	@Override
	public void updateCollege(int collegeID) {
		// TODO Auto-generated method stub
		Session session = null;
		CollegeDTO collage = null;
		try {
			Configuration con = new Configuration();
			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			collage = session.get(CollegeDTO.class, collegeID);
			collage.setNoOfBranches(10);
			collage.setcLocation("bengaluru");
			collage.setNoOfStudents(800);
			session.beginTransaction();
			session.update(collage);
			// session.save(College);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}
	}

}
