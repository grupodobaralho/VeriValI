package e3_valores;

public class Valores implements ValoresITF {

	private int[] valores;
	private int cont;

	public Valores() {
		valores = new int[10];
		cont = 0;
	}

	@Override
	public boolean ins(int n) {

		if (n <= 0 || cont >= 10)
			return false;
		valores[cont] = n;
		cont++;
		return true;
	}

	@Override
	public int del(int i) {
		if (i < 0)
			throw new IllegalArgumentException("Indice invalido");
		if (i >= 10)
			throw new IndexOutOfBoundsException("Indice invalido");
		if (cont == 0 || valores[i] == 0)
			return -1;
		int aux = valores[i];
		for (int j = i; j < cont; j++) {
			valores[j] = valores[j + 1];
		}
		cont--;
		return aux;
	}

	@Override
	public int size() {
		return cont;
	}

	@Override
	public double mean() {
		if (cont == 0)
			return 0;
		double aux = 0;
		for (int i = 0; i < cont; i++) {
			aux += valores[i];
		}
		return aux / cont;
	}

	@Override
	public int greater() {
		if (cont == 0)
			return -1;
		int aux = valores[0];
		for (int i = 0; i < cont; i++) {
			if (aux < valores[i])
				aux = valores[i];
		}
		return aux;
	}

	@Override
	public int lower() {
		if (cont == 0)
			return -1;
		int aux = valores[0];
		for (int i = 0; i < cont; i++) {
			if (aux > valores[i])
				aux = valores[i];
		}
		return aux;
	}

}
