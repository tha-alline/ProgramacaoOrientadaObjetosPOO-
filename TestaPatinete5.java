package POO;

public class TestaPatinete5 {

	public static void main(String[] args) {
		
		PatineteExercicio5 p1 = new PatineteExercicio5();
		PatineteExercicio5 p2 = new PatineteExercicio5();
		
		p1.cor = "Rosa";
		p1.tamanho = "Médio";
		p1.tipo = "Elétrico";
		p1.preco = 150.00;
		
		p2.cor = "Lilás";
		p2.tamanho = "Pequeno";
		p2.tipo = "Manual";
		p2.preco = 130.00;
		
		p1.vender();
		System.out.println("Patinete TAM: " + p1.tamanho + " - Tipo:" + p1.tipo + " - Valor: R$ " + p1.preco + " (" + p1.cor + ") ");
		System.out.println();
		p2.vender();
		System.out.println("Patinete TAM: " + p2.tamanho + " - Tipo:" + p2.tipo + " - Valor: R$ " + p2.preco + " (" + p2.cor + ") ");
		System.out.println();
			
	}
}