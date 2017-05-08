package com.impl;

import org.hibernate.Session;

import com.util.HibernateUtil;

import com.dao.ILibro;
import com.model.Libro;

public class LibroImpl implements ILibro {

	@Override
	public boolean insertar(Libro libro) {

		Session session= null;
		try {
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			System.out.println("Conectado Exitosamente");
			session.save(libro);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public boolean borrar(Libro libro) {
		Session session= null;
		try {
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			System.out.println("Conectado Exitosamente");
			session.delete(libro);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public boolean modificar(Libro libro) {
		Session session= null;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			System.out.println("Conectado Exitosamente");
			session.update(libro);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public Libro obtener(int idLibro) {
		Session session= null;
		Libro libro;
		try {
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			System.out.println("Conectado Exitosamente");
			libro = (Libro)session.get(Libro.class, idLibro);
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return libro;
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return null;
		}
	}

}
