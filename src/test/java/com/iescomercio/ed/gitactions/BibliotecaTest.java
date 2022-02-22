package com.iescomercio.ed.gitactions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {

	Biblioteca b;

	@Before
	public void metodoBeforeEach() {
		b = new Biblioteca();
		b.aniadirLibro(new Libro("123456789", "El principito"));
		b.aniadirLibro(new Libro("123456781", "Los pilares de la tierra"));
	}

	@Test
	public void testBiblioteca() {
		b = new Biblioteca();
		assertEquals(0, b.numLibros());
	}

	@Test
	public void testNumLibros() {
		assertEquals(2, b.numLibros());
	}

	@Test
	public void testAniadirLibro() {

		assertFalse(b.aniadirLibro(new Libro("823456789", "El principito")));
		assertTrue(b.aniadirLibro(new Libro("123456789", "El principito")));

		int numAntes = b.numLibros();
		b.aniadirLibro(new Libro("123456789", "El principito"));
		int numDespues = b.numLibros();
		assertEquals(numAntes + 1, numDespues);

		numAntes = b.numLibros();
		b.aniadirLibro(new Libro("823456789", "El principito"));
		numDespues = b.numLibros();
		assertEquals(numAntes, numDespues);
	}


	@Test
	public void testSetLibros() {
		ArrayList<Libro> libros = new ArrayList<>(
				Set.of(new Libro("123456789", "El principito"), new Libro("123456781", "Los pilares de la tierra")));

		b.setLibros(libros);
		assertArrayEquals(libros.toArray(), b.getLibros().toArray());
	}

}
