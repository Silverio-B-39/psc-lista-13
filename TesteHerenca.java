package Herenca;

public class TesteHerenca {

	public static void main(String[] args) {

		System.out.println("           Teste de Hierarquia e Herança          ");

		Pessoa p = new Pessoa("Ana Paula", "111.111.111-11", 25);
		p.exibirDadosBasicos();

		Funcionario f = new Funcionario("Carlos Souza", "222.222.222-22", 30, 4500.00, "Analista Junior");
		System.out.println("\n--------------------------------------------------");
		f.exibirDadosBasicos();

		double salarioAnualF = f.calcularSalarioAnual();
		System.out.println("Salário Anual (Funcionário): R$" + String.format("%.2f", salarioAnualF));

		Gerente g = new Gerente("Roberto Lima", "333.333.333-33", 45, 12000.00, "Gerente de Projetos", "TI");
		System.out.println("\n--------------------------------------------------");

		g.exibirDadosBasicos();

		double salarioAnualG = g.calcularSalarioAnual();
		System.out.println("Salário Anual (Gerente): R$" + String.format("%.2f", salarioAnualG));

		System.out.println("==================================================");
	}
}
