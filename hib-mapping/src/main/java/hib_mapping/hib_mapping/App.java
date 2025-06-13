package hib_mapping.hib_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session sess = factory.openSession();
        Transaction tx = sess.beginTransaction();
        
        Person p = new Person();
        Aadhaar a = new Aadhaar(111, "amit", "pune", "M", "12/06/2022", p);
        p.setId(1);
        p.setAadhaarCard(a);
        
        sess.persist(a);
        sess.persist(p);
        
        tx.commit();
    }
}
