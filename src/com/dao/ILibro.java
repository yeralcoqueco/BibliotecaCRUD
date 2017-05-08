package com.dao;

import com.model.Libro;

public interface ILibro {

	public boolean insertar(Libro libro );
	public boolean modificar(Libro libro );
	public boolean borrar(Libro libro );
	public Libro obtener(int idLibro );
	
	
}
