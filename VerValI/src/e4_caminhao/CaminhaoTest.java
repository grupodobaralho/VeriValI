package e4_caminhao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaminhaoTest {

	Caminhao caminhao;

	@Before
	public void init() {
		caminhao = new Caminhao();
	}

	@Test
	public void testAddCargaOk() throws CaminhaoCheioException {
		assertEquals("O caminhao deve aceitar esta carga", caminhao.addCarga(1499), 1, 0.001);
	}

	@Test
	public void testAddCargaNoLimite() throws CaminhaoCheioException {
		assertEquals("O comanhao deve aceitar esta carga", caminhao.addCarga(1500), 0, 0.001);
	}
	
	@Test(expected = CaminhaoCheioException.class)
	public void testAddCargaExtrapola() throws CaminhaoCheioException {
		caminhao.addCarga(1501);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddCargaNegativa() throws CaminhaoCheioException {
		caminhao.addCarga(-1);
	}

	@Test
	public void testAddCargaEmSequencia() throws CaminhaoCheioException {
		caminhao.addCarga(100);
		caminhao.addCarga(350);
		caminhao.addCarga(1000);
		assertEquals("Caminhao deve estar pronto para transportar a carga, ", caminhao.addCarga(50), 0);
	}
}
