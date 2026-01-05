package klu.Hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //Create or insert
        employee e = new employee();
        e.setName("Laptop");
        e.setDescription("Gaming laptop with 16GB RAM");
        e.setPrice(75000.50);
        e.setQuantity(10);

        session.persist(e);   // Hibernate 6+ compatible
        tx.commit();
        System.out.println("Record inserted Successfully!");
        
        
        //retrieve
        
      
        
        
        session.close();
    }
}
