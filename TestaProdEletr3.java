package POO;

public class TestaProdEletr3 {

	public static void main(String[] args) {
		
		ProdutoEletronicoExercicio3 produto1 = new ProdutoEletronicoExercicio3();
		ProdutoEletronicoExercicio3 produto2 = new ProdutoEletronicoExercicio3();
		
		produto1.marca = "DELL";
		produto1.tipo = "Notebook Dell XPS 13 i7";
		produto1.status = "Lan�amento";
		produto1.pre�o = 12398.99;
		
		produto2.marca = "Samsung";
		produto2.tipo = "Samsung Galaxy S22";
		produto2.status = "Pr�-lan�amento";
		produto2.pre�o = 5999.99;
		
		produto1.venderProdutos();
		
		System.out.println("Produto: " + produto1.tipo + " - Marca: " + produto1.marca + " (" + produto1.status + ") ");
		System.out.println("Valor: R$ " + produto1.pre�o);
		System.out.println();
		System.out.println("Produto: " + produto2.tipo + " - Marca: " + produto2.marca + " (" + produto2.status + ") ");
		System.out.println("Valor: R$ " + produto2.pre�o);
		System.out.println();


	}
}