package e1_triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {
	
	Triangulo triangulo;
	
	@Test
	public void testEquilatero(){
		triangulo = new Triangulo(1,4,5);
		assertEquals("Triangulo não-equilatero não deveria passar!", triangulo.eEquilatero(), false);
		triangulo = new Triangulo(4, 4, 4);
		assertEquals("Triangulo equilátero deveria passar!", triangulo.eEquilatero(), true);	
	}
	
	@Test
	public void testPerimetro(){
		triangulo = new Triangulo(2, 2, 4);
		assertEquals("Perimetro não está correto!", triangulo.perimetro(), 8, 0.001);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPerimetroException() {
		triangulo = new Triangulo(10, -3, 4);
		triangulo.perimetro();
	}
	


}
