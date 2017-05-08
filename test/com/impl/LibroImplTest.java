package com.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dao.ILibro;
import com.impl.LibroImpl;
import com.model.Autor;
import com.model.Categoria;
import com.model.Editorial;
import com.model.Idioma;
import com.model.Libro;

public class LibroImplTest {

	@Test
	public void testInsertar() {
		
	    ILibro libroDAO= new LibroImpl();
		
		Libro libro= new  Libro();
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		editorial.setIdEditorial(3);
		autor.setIdAutor(5);
		idioma.setIdIdioma(8);
		categoria.setIdCategoria(2);
		
		libro.setTitulo("Nuevo libro");
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		assertEquals(true, libroDAO.insertar(libro));
		
	}

	

	@Test
	public void testModificar() {
		
	    ILibro libroDAO= new LibroImpl();
		
		Libro libro= new  Libro();
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		editorial.setIdEditorial(2);
		autor.setIdAutor(1);
		idioma.setIdIdioma(1);
		categoria.setIdCategoria(4);
		
		libro.setTitulo("libro 2");
		libro.setIdLibro(1);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		assertEquals(true, libroDAO.modificar(libro));
		
	}
	
	@Test
	public void testSeleccionar() {
		
	    ILibro libroDAO= new LibroImpl();
	    Libro libro= new  Libro();
	    libro.setIdLibro(1);
		assertEquals(Libro.class, libroDAO.obtener(libro.getIdLibro()).getClass());
	}
	
	@Test
	public void testBorrar() {
		
	    ILibro libroDAO= new LibroImpl();
		
		Libro libro= new  Libro();
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		editorial.setIdEditorial(3);
		autor.setIdAutor(5);
		idioma.setIdIdioma(8);
		categoria.setIdCategoria(2);
		
		libro.setTitulo("Nuevo libro");
		libro.setIdLibro(1);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);
		
		assertEquals(true, libroDAO.borrar(libro));
		
	}

}
