package com.iescomercio.ed.gitactions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {

private Libro l;
	
	@Before
	public void metodoBeforeEach() {
		l = new Libro("123456789", "El principito");
	}

	@Test
	public void testLibro() {
		assertEquals("123456789", l.getIsbn());
		assertEquals("El principito", l.getTitulo());
	}

	@Test
	public void testGetIsbn() {
		assertEquals("123456789", l.getIsbn());
	}

	@Test
	public void testSetIsbn() {
		Boolean haPasado = false;
		try {
			l.setIsbn("987654321");
			assertEquals("987654321", l.getIsbn());
		} catch (Exception e) {
			haPasado = true;
		}
		assertFalse(haPasado);
	}
	
	@Test
	public void testSetIsbn2() {
		Boolean haPasado = false;
		try {
			l.setIsbn("123");
		} catch (Exception e) {
			haPasado = true;
		}
		assertTrue(haPasado);
	}


	@Test
	public void testGetTitulo() {
		assertEquals("El principito", l.getTitulo());
	}

	@Test
	public void testSetTitulo() {
		l.setTitulo("Los pilares de la tierra");
		assertEquals("Los pilares de la tierra", l.getTitulo());
	}
	
	@Test
	public void testIsAventuras() {
		assertTrue(l.isAventuras());
		
		Libro l2 = new Libro("923456789", "El principito");
		assertFalse(l2.isAventuras());
	}

}
