package in.shashi.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.shashimodel.Student;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	static {
		Configuration config = new Configuration();
		Configuration connection = config.configure();
		sessionFactory =connection.addAnnotatedClass(Student.class).buildSessionFactory();
	}
	public static Session getSession() {
		if(session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	
}
