package com.mvn.annot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();
        
        Metadata metadata = new MetadataSources(registry).buildMetadata();
        
        SessionFactory sessionFactory = metadata.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Teacher teacher = new Teacher();
        
        teacher.setTeacher_age(66);
        teacher.setTeacher_name("john");
        
        session.save(teacher);
        
        transaction.commit();
        
        sessionFactory.close();
        
        session.close();
    }
}
