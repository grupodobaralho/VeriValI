package e3_valores;


public class Valores implements ValoresITF {
	
	private int[] armazenador;
	private int cont;
	
	public Valores() {
		armazenador = new int[9];
		cont = 0;
	}

	@Override
	public boolean ins(int v) {
	
		if(v > 0 && cont < 10) {
			armazenador[cont] = v;
			cont++;
			return true;
		}
		return false;
	}

	@Override
	public int del(int i) {
		if(cont == 0 || armazenador[i] == 0) return -1;
		if(i<0 && i>10) 
			throw new IllegalArgumentException("Indice inválido");
		int aux = armazenador[i];
		for(int j=i; j<cont; j++) {
			armazenador[j] = j+1;
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
		if(cont == 0) return 0;
		double aux = 0;
		for(int i=0; i<cont; i++) {
			aux+=armazenador[i];
		}
		return aux/cont;
	}

	@Override
	public int greater() {
		if(cont == 0) return -1;
		int aux = armazenador[0];
		for(int i=0; i<cont; i++) {
			if(aux < armazenador[i]) aux = armazenador[i];
		}
		return aux;
	}

	@Override
	public int lower() {
		if(cont == 0) return -1;
		int aux = armazenador[0];
		for(int i=0; i<cont; i++) {
			if(aux > armazenador[i]) aux = armazenador[i];
		}
		return aux;
	}

}
