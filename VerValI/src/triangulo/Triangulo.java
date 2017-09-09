package triangulo;

public class Triangulo {

	private float l1, l2, l3;

	public Triangulo(float l1, float l2, float l3) {
		if(l1<0 || l2<0 || l3<0)
			throw new IllegalArgumentException("ERRO: EXISTE UM NUMERO INVALIDO NEGATIVO");
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public boolean eEquilatero() {
		if(l1==l2 && l1==l3) 
			return true;
		return false;
	}

	public float perimetro() {
		return l1 + l2 + l3;
	}

}
