package POO;

public class TestaConta {

	public static void main(String[] args) {

		ContaExercicio6 pessoa1 = new ContaExercicio6();
		
		pessoa1.agencia = 1206;
		pessoa1.conta = 000365.4;
		pessoa1.nome = "Lara Liz Silva Almeida";
		pessoa1.banco = "Nu - Nubank";
		pessoa1.tipo = "(Conta Corrente)";
		pessoa1.chavePix = 999111222-33;
		
		pessoa1.transferir();
		System.out.println();
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Banco: " + pessoa1.banco + " " + pessoa1.tipo);
		System.out.println("Agência: " + pessoa1.agencia + " | Conta: " + pessoa1.conta);
		System.out.println("Chave Pix: " + pessoa1.chavePix);
		
		}
	}