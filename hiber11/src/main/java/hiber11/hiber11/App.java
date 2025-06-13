package hiber11.hiber11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();    
        SessionFactory fact = cfg.buildSessionFactory();      
        
        Session sess = fact.openSession();
        
        
        Student st = sess.find(Student.class, 2);
        
        System.out.println(st);
    }
}