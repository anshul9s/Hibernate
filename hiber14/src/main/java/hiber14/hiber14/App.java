package hiber14.hiber14;

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
        
        Student st = new Student(3, "deep", 7.4f, "cse");
        
        sess.persist(st);
        
        tx.commit();
    }
    
    public static void read()
    {
    	Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student st = sess.find(Student.class, 2);
        
        System.out.println(st);
    }
    
    public static void update()
    {
    	Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student st = sess.find(Student.class, 3);
        st.setName("deepika");
        
        Transaction tx = sess.beginTransaction();
        sess.merge(st);
        
        tx.commit();
    }
    
    public static void delete()
    {
        Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        Student st = sess.find(Student.class, 3);
        st.setName("deepika");
        
        Transaction tx = sess.beginTransaction();
        sess.remove(st);
        
        tx.commit();
    }
    
    
}
//https://github.com/deep473/jan-hiber