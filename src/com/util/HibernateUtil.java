package com.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	public static SessionFactory buildSessionFactory(){
		
		try {
			
			return new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
			
					
		} catch (Exception e) {
			
			System.err.println("Error en la Session Factory: "+e);
			throw new ExceptionInInitializerError(e);
		}
	
	}
	
	public static SessionFactory getSessionFactoty(){
		
		return SESSION_FACTORY;
	}
	
	public static void shutdown(){
		getSessionFactoty().close();
	}

}

