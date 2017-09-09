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
		if(v > 0) {
			armazenador[cont] = v;
			cont++;
			return true;
		}
		return true;
	}

	@Override
	public int del(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mean() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int greater() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lower() {
		// TODO Auto-generated method stub
		return 0;
	}

}
