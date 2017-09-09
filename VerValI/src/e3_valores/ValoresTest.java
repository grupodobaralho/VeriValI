package e3_valores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {

	Valores valores;

	@Before
	public void init() {
		valores = new Valores();
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test
	public void testInsPositivo() {
		assertTrue("a Função deve aceitar V>0", valores.ins(1));
	}

	@Test
	public void testInsZero() {
		assertFalse("A função não deve aceitar 0", valores.ins(0));
	}

	@Test
	public void testInsNegativo() {
		assertFalse("A função não deve aceitar negativo", valores.ins(-1));
	}

	@Test
	public void testInsMaiorIgual10() {
		int cont = 10;
		while (cont < 10)
			assertTrue("A Função deve aceitar qtd < 10", valores.ins(1));
		assertFalse("A função não deve aceitar qtd = 10", valores.ins(2));
		assertFalse("A função não deve aceitar qtd > 10", valores.ins(3));
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test(expected = IllegalArgumentException.class)
	public void testDelIndiceNegativo() {
		valores.del(-1);
	}

	@Test
	public void testDelIndiceValido() {
		valores.ins(10);
		assertEquals("O indice 0 deve ser válido", valores.del(0), 10);
	}

	@Test
	public void testDelIndiceValidoMaior() {
		valores.ins(10);
		valores.ins(11);
		assertEquals("O indice 1 deve ser válido para cont>=2", valores.del(1), 11);
	}

	@Test
	public void testDelListaVazia() {
		assertEquals("A lista está vazia", valores.del(0), -1);
	}

	@Test
	public void testDelIndiceVazio() {
		valores.ins(10);
		assertEquals("O índice está vazio", valores.del(1), -1);
	}

	@Test
	public void testDelIndice10() {
		assertEquals("O índice está vazio", valores.del(10), -1);
	}

	@Test
	public void testDelIndiceMaior10() {
		assertEquals("O índice está vazio", valores.del(11), -1);
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test
	void testSizeListaVazia() {
		assertEquals("A lista está vazia=0", valores.size(), 0);
	}

	@Test
	void testSizeListaContem1() {
		valores.ins(1);
		assertEquals("A lista contém 1", valores.size(), 1);
	}

	@Test
	void testSizeListaContem2() {
		valores.ins(1);
		valores.ins(1);
		assertEquals("A lista contém 2", valores.size(), 2);
	}

	@Test
	void testSizeListaVaziaPosDel() {
		valores.ins(1);
		valores.del(0);
		assertEquals("A lista continha um e agora está vazia", valores.size(), 0);
	}

	@Test
	void testSizeListaContem1PosDel() {
		valores.ins(1);
		valores.ins(1);
		valores.del(0);
		int result = valores.size();
		assertEquals("A lista continha dois e agora contém 1", result, 1);
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test
	void testMeanListaVazia() {
		assertEquals("A lista está vazia, deve retornar 0", valores.mean(), 0, 000.1);
	}

	@Test
	void testMeanValorUnico() {
		valores.ins(5);
		double expected = 5;
		double result = valores.mean();
		assertEquals("A média de um valor é ele mesmo", result, expected, 000.1);
	}

	@Test
	void testMeanDoisValores() {
		valores.ins(5);
		valores.ins(10);
		double expected = 7.5;
		double result = valores.mean();
		assertEquals("A média de 5 e 10 é 7.5", result, expected, 000.1);
	}

	@Test
	void testMeanTresValores() {
		valores.ins(5);
		valores.ins(10);
		valores.ins(15);
		double expected = 10.0;
		double result = valores.mean();
		assertEquals("A média de 5 10 e 15 é 10.0", result, expected, 000.1);
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test
	public void testGreaterListaVazia() {
		assertEquals("O maior valor da lista vazia deve retornar -1", valores.greater(), -1);
	}

	@Test
	public void testGreaterUmElemento() {
		valores.ins(3);
		int expected = 3;
		int result = valores.greater();
		assertEquals("O maior valor de uma lista com um valor é ele mesmo", result, expected);
	}

	@Test
	public void testGreater() {
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(3);
		int expected = 3;
		int result = valores.greater();
		assertEquals("O maior valor entre 1,2 e 3 é 3", result, expected);
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	@Test
	public void testLowerListaVazia() {
		assertEquals("O menor valor da lista vazia deve retornar -1", valores.lower(), -1);
	}

	@Test
	public void testLowerUmElemento() {
		valores.ins(3);
		int expected = 3;
		int result = valores.lower();
		assertEquals("O menor valor de uma lista com um valor é ele mesmo", result, expected);
	}

	@Test
	public void testLower() {
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(3);
		int expected = 1;
		int result = valores.lower();
		assertEquals("O maior valor entre 1,2 e 3 é 3", result, expected);
	}
}
