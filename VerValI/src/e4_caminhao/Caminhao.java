package e4_caminhao;

public class Caminhao {
	private String placa;
	private long capacidade;

	public Caminhao() {
		placa = "HERCI-10";
		capacidade = 1500;
	}

	public long addCarga(long carga) throws CaminhaoCheioException {
		if (carga < 0)
			throw new IllegalArgumentException("Carga Negativa");

		if (carga > capacidade)
			throw new CaminhaoCheioException("Capacidade Excedida");

		return capacidade -= carga;
	}
}
