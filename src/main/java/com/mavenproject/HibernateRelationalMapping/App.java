package com.mavenproject.HibernateRelationalMapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLaname("Apple");
    	
    	Student student = new Student();
    	student.setRollno(1);
    	student.setName("Snigdha");
    	student.setMarks(50);
    	student.getLaptop().add(laptop);
    	
    	laptop.getStudent().add(student);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf = config.buildSessionFactory();
		
        Session session = sf.openSession();
        session.beginTransaction();
        
        session.save(student);
        session.save(laptop);
        session.getTransaction().commit();
        session.close();
    	
    }
}
