package com.iescomercio.ed.gitactions;

import java.util.Objects;

public class Libro {
	
	private String isbn;
	private String titulo;
	
	public Libro(String isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) throws Exception {
		if(isbn.length()==9) {
			this.isbn = isbn;
		}else {
			throw new Exception("isbn no es correcto");
		}
	}
	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//ISBN que empiezan en 1 son de aventuras
	public boolean isAventuras() {
		return this.getIsbn().startsWith("1");
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
