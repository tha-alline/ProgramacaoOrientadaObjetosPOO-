package POO;

public class TestaPaciente {

	public static void main(String[] args) {

		PacienteExercicio7 paciente = new PacienteExercicio7();
		
		paciente.nome = "Liz Dias Silva e Campos de Almeida";
		paciente.sexo = "F";
		paciente.idade = 1;
		paciente.peso = 7;
		paciente.altura = 0.75;
		paciente.diagnostico = "Otite";
		paciente.convenio = "Unimed";
		
		paciente.internacao();
		
		System.out.println();
		System.out.println("Convenio " + paciente.convenio);
		System.out.println("Nome: " + paciente.nome + "     Idade: " + paciente.idade + " anos    Sexo: " + paciente.sexo);
		System.out.println("Peso: " + paciente.peso +   "   Altura: " + paciente.altura);
		System.out.println("Diagnóstico: " + paciente.diagnostico);

		}
	}