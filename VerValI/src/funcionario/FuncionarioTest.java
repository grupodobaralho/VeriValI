package funcionario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FuncionarioTest {
	
	Funcionario funcionario;
	
	@Before
	public void init() {
		funcionario = new Funcionario("Pomper", 100.0);
	}
	
	@Test
	public void testSalarioBruto() {
		double expected = 500.0;
		assertEquals(expected, funcionario.salarioBruto(5), 0.001);		
	}
	
	@Test
	public void testSalarioBrutoZero() {
		double expected = 0.0;
		assertEquals(expected, funcionario.salarioBruto(0), 0.001);		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSalarioBrutoNumeroNegativo() {
		funcionario.salarioBruto(-1);	
	}
	
	@Test
	public void testSalarioLiquidoZero() {
		double salarioLiquido = funcionario.salarioLiquido(0);
		double expected = 0.0;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSalarioLiquidoNumeroNegativo() {
		funcionario.salarioLiquido(-1);	
	}
	
	@Test
	public void testSalarioLiquidoInferior2000() {
		double salarioLiquido = funcionario.salarioLiquido(1999);
		double expected = 1799.1;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test
	public void testSalarioLiquidoIgual2000() {
		double salarioLiquido = funcionario.salarioLiquido(2000);
		double expected = 1500.0;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test
	public void testSalarioLiquidoMaior2000() {
		double salarioLiquido = funcionario.salarioLiquido(2001);
		double expected = 1500.75;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test
	public void testSalarioLiquidoMenor5000() {
		double salarioLiquido = funcionario.salarioLiquido(4999);
		double expected = 3749.25;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test
	public void testSalarioLiquidoIgual5000() {
		double salarioLiquido = funcionario.salarioLiquido(5000);
		double expected = 3125.0;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	
	@Test
	public void testSalarioLiquidoMaior5000() {
		double salarioLiquido = funcionario.salarioLiquido(5001);
		double expected = 3125.625;
		assertEquals(expected, salarioLiquido, 0.001);		
	}
	

}
