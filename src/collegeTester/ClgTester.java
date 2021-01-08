package collegeTester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import xworks.college.CollegeDTO;

public class ClgTester {
public static void main(String[] args) {
	Configuration con= new Configuration();
	con.configure();
	SessionFactory sessionFactory=con.buildSessionFactory();
	Session session = sessionFactory.openSession();
   session.beginTransaction();
   CollegeDTO collegeDTO= new CollegeDTO(1 , "Kit", "Tiptur",500,30, 4);
		session.save(collegeDTO);
		session.getTransaction().commit();
		session.close();
}
}
