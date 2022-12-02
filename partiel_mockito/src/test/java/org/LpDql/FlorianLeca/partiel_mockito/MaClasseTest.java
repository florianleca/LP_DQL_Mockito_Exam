package org.LpDql.FlorianLeca.partiel_mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MaClasseTest {

	MaClasse obj;
	MaClasse service = Mockito.mock(MaClasse.class);
	
	@Before
	public void setUp() {
		obj = new MaClasse();
	}
	
	@After
	public void tearDown() {
		obj = null;
	}

	@Test
	public void testHelloWorld() {
		assertEquals("Hello World!", obj.helloWorld());
		when(service.helloWorld()).thenReturn("Goodbye...");
		assertEquals("Goodbye...", service.helloWorld());
		verify(service).helloWorld();
	}
}
