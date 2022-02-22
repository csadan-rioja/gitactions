package com.iescomercio.ed.gitactions;

import java.util.Objects;

public class Libro {
	
	private String isbn;
	private String titulo;
	
	public Libro(String isbn, String titulo) {

	}
	
	public String getIsbn() {
	}
	
	//solo se modificará si el isbn tiene 9 elementos, en caso contrario lanzará una excepción
	public void setIsbn(String isbn) throws Exception {

	}
	public String getTitulo() {
	}
	
	
	public void setTitulo(String titulo) {
	}
	
	//ISBN que empiezan en 1 son de aventuras
	public boolean isAventuras() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}
	
	
	

}
