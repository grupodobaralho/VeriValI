package isra;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	
	Triangulo triangulo;
	
	@Test
	public void testEquilatero(){
		triangulo = new Triangulo(1,4,5);
		assertEquals(triangulo.eEquilatero(), false);
		triangulo = new Triangulo(4, 4, 4);
		assertEquals(triangulo.eEquilatero(), true);	
	}
	
	@Test
	public void testPerimetro(){
		triangulo = new Triangulo(2, 2, 4);
		assertEquals(triangulo.perimetro(), 8, 0.001);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPerimetroException() {
		triangulo = new Triangulo(10, -3, 4);
		triangulo.perimetro();
	}
	


}
