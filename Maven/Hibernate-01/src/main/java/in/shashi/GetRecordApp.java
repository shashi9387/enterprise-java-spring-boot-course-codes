package in.shashi;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.shashi.util.HibernateUtil;
import in.shashimodel.Student;

/**
 * Hello world!
 *
 */
public class GetRecordApp 
{
    public static void main( String[] args )
    {
        System.out.println(HibernateUtil.getSession());
        Session session= null;
        int id=102;
        try {
        	session= HibernateUtil.getSession();
        	
        	if(session != null) {
        		Student student = session.get(Student.class,id);
        		if(student != null) {
        			System.out.println(student);
        		}
        		else {
        			System.out.println("Record not available");
        		}
        	}
        }
        catch(HibernateException he) {
        	he.printStackTrace();
        }
        catch (Exception e) {
			e.printStackTrace();
		} 
        finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		

	}
    }
}
