package POO;

public class TestaAviao2 {
public static void main(String[] args) {
		
		AviaoExercicio2 cliente1 = new AviaoExercicio2();
		AviaoExercicio2 cliente2 = new AviaoExercicio2();
		
		cliente1.companhia = "Azul";
		cliente1.origem = "São Paulo";
		cliente1.destino = "Irlanda";
		cliente1.nome = "Alline, Thaís";
		cliente1.assento = "A6";
		cliente1.quantBagagem = 2;
		cliente1.pesoBagagem= 19.99;
		
		cliente2.companhia = "LATAM";
		cliente2.origem = "Belo Horizonte";
		cliente2.destino = "São Paulo";
		cliente2.nome = "Junior, Daniel";
		cliente2.assento = "E12";
		cliente2.quantBagagem = 1;
		cliente2.pesoBagagem= 9.99;
		
		cliente1.irViajar();
		System.out.println("Companhia Aérea: " + cliente1.companhia);
		System.out.println("Origem: " + cliente1.origem + " - Destino: " + cliente1.destino);
		System.out.println("Passageiro: " + cliente1.nome + "  -  Assento: " + cliente1.assento);
		System.out.println("Quantidade: " + cliente1.quantBagagem + "  -  PESO: " + cliente1.pesoBagagem + "kg");
		System.out.println();
		cliente2.irViajar();
		System.out.println("Companhia Aérea: " + cliente2.companhia);
		System.out.println("Origem: " + cliente2.origem + " - Destino: " + cliente2.destino);
		System.out.println("Passageiro: " + cliente2.nome + "  -  Assento: " + cliente2.assento);
		System.out.println("Quantidade: " + cliente2.quantBagagem + "  -  PESO: " + cliente2.pesoBagagem + "kg");
		
		}
}