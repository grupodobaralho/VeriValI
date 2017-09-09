package e2_funcionario;

public class Funcionario {
	private String nome;
	private double valorHora;

	public Funcionario(String umNome, double umValorHora) {
		nome = umNome;
		if (umValorHora < 0.0)
			valorHora = 1.0;
		else
			valorHora = umValorHora;
	}

	public String getNome() {
		return (nome);
	}

	public double salarioBruto(int nroHorasTrabalhadas) {
		return (valorHora * nroHorasTrabalhadas);
	}

	public double salarioLiquido(double salarioBruto) {
		double inss = salarioBruto * 0.1;
		double ir = 0; // Se salario < 2000
		if ((salarioBruto >= 2000) && (salarioBruto < 5000.0))
			ir = salarioBruto * 0.15;
		if (salarioBruto >= 5000)
			ir = salarioBruto * 0.275;
		return (salarioBruto - inss - ir);
	}
}