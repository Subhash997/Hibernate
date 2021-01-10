package collegeTester;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import xworks.college.CollegeDTO;
import xworks.college.clgId.clgDAOimpl;

public class ClgTester {
	/*
	 * public static void main(String[] args) { Session session = null; try {
	 * Configuration con = new Configuration();
	 * 
	 * con.configure(); SessionFactory sessionFactory = con.buildSessionFactory();
	 * session = sessionFactory.openSession(); session.beginTransaction();
	 * CollegeDTO collegeDTO = new CollegeDTO(8, "AIT", "Banglore", 700, 30, 4);
	 * session.save(collegeDTO); session.getTransaction().commit(); } catch
	 * (Exception e) { e.printStackTrace(); } finally { if
	 * (Objects.nonNull(session)) {
	 * System.out.println("session closed successfully"); } else {
	 * System.out.println("session not closed "); } } }
	 */
	public static void main(String[] args) {
		clgDAOimpl clgDAOimpl1=new clgDAOimpl();
	CollegeDTO collegeDTO=new CollegeDTO(11, "rrit", "bengaluru", 500, 30, 6);
	CollegeDTO collegeDTO2=new CollegeDTO(12, "uvc", "bengaluru", 100, 50, 10);

	clgDAOimpl1.saveCollege(collegeDTO);
	clgDAOimpl1.saveCollege(collegeDTO2);
	clgDAOimpl1.fetchCollege(4);
	
	}
	
	
	
	
	
	
}
