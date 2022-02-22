package com.iescomercio.ed.gitactions;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		libros = new ArrayList<>();
	}

	public int numLibros() {
		return libros.size();
	}
	
	public boolean aniadirLibro(Libro l) {
		if(l.isAventuras()) {
			libros.add(l);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

}
