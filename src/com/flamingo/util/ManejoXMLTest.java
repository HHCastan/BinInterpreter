package com.flamingo.util;

import org.junit.Test;

import com.flamingo.test.Prueba;

import junit.framework.TestCase;

public class ManejoXMLTest extends TestCase {

	@Test
	public void testManejoXMLString() {
		String esperado = "800";
		ManejoXML s = new ManejoXML(Prueba.class.getResourceAsStream("/xml/confMensajes.xml"));
		String resultado = s.validateMessage("4697707");
		assertEquals(esperado, resultado);
	}

}
