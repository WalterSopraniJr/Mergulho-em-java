
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 26;
		int quantidadePessoas = 3;
		
		System.out.println("Você tem " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Maior de idade. Entrada permitida.");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você é menor, mas pode entrar por estar acompanhado");
			}
			System.out.println("Menor de idade. Infelizmente não é permitida a entrada.");
		}

	}

}
