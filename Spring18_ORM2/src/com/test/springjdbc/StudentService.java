package com.test.springjdbc;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class StudentService {

	// Configure Hibernate code into Spring Service class
	
	SessionFactory factory = null;
	Configuration configuration = null;
	
	public StudentService()
	{
		System.out.println("Constructor started....");
		configuration = new Configuration();
		configuration.configure();
		
		factory = configuration.buildSessionFactory();
	}
	
	public void loadStudent(int id)
	{
		System.out.println("Load student....");
		Session session = factory.openSession();
		
		Student student = (Student) session.load(Student.class, id);
		
		System.out.println("Student name is "+student.getName());
	}
}
