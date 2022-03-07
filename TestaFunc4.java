package POO;

public class TestaFunc4 {
	public static void main(String[] args) {
		
		FuncionarioExercicio4 funcionario1 = new FuncionarioExercicio4();
		FuncionarioExercicio4 funcionario2 = new FuncionarioExercicio4();
		FuncionarioExercicio4 funcionario3 = new FuncionarioExercicio4();
		
		funcionario1.nome = "Geruza";
		funcionario1.sobrenome = "Almeida Dias";
		funcionario1.endereço = "Rua: Jose do Amaral nº232";
		funcionario1.cargo = "Gerente Administrativo";
		funcionario1.salario = 5500.00;
		
		funcionario2.nome = "Márcio";
		funcionario2.sobrenome = "Aguiar Silva";
		funcionario2.endereço = "Rua: Jose Novato nº613";
		funcionario2.cargo = "Encarregado de Produção";
		funcionario2.salario = 3100.00;
		
		funcionario3.nome = "Gabriel";
		funcionario3.sobrenome = "Bendillati Silva";
		funcionario3.cargo = "Desenvolvedor Java Pleno";
		funcionario3.salario = 10000.00;
		
		funcionario1.registrar();
		System.out.println("Nome: " + funcionario1.nome + " - Sobrenome: " + funcionario1.sobrenome + " (CARGO " + funcionario1.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario1.salario);
		System.out.println();
		funcionario2.registrar();
		System.out.println("Nome: " + funcionario2.nome + " - Sobrenome: " + funcionario2.sobrenome + " (CARGO " + funcionario2.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario2.salario);
		System.out.println();
		funcionario3.registrar();
		System.out.println("Nome: " + funcionario3.nome + " - Sobrenome: " + funcionario3.sobrenome + " (CARGO " + funcionario3.cargo + ") ");
		System.out.println("Salário: R$ " + funcionario3.salario);
		System.out.println();

	}
}