
public class TestaEscopoDeVariaveis {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 26;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("Você está com  " + quantidadePessoas + " pessoas.");

		if (idade >= 18 && acompanhado) {
			System.out.println("Entrada permitida.");
		} else {
			System.out.println("Menor de idade. Infelizmente não é permitida a entrada.");
		}
		
		

	}
}
