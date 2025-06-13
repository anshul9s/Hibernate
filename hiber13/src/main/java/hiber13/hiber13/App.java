
package hiber13.hiber13;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) {
		create();
//		read();
//		update();
//		delete();
	}
	
    public static void create()
    {
    	Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        Transaction tx = sess.beginTransaction();
        
        Student2 st1 = new Student2(1, "deep", 7.4f, "cse");
        Student2 st2 = new Student2(2, "madhav", 6.4f, "cvil");
        Student2 st3 = new Student2(3, "anshul", 8.4f, "IT");
        
        sess.persist(st1);
        sess.persist(st2);
        sess.persist(st3);
        
        tx.commit();
    }
    
    public static void read()
    {
    	Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student2 st = sess.find(Student2.class, 2);
        
        System.out.println(st);
    }
    
    public static void update()
    {
    	Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student2 st = sess.find(Student2.class, 2);
        st.setName("Pinky");
        
        Transaction tx = sess.beginTransaction();
        sess.merge(st);
        
        tx.commit();
    }
    
    public static void delete()
    {
        Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student2 st = sess.find(Student2.class, 3);
        st.setName("anshul");
        
        Transaction tx = sess.beginTransaction();
        sess.remove(st);
        
        tx.commit();
    }
    
    
}
//https://github.com/deep473/jan-hiber