
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais com boleanos");

		int idade = 26;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; // s� aceita true ou false 

		System.out.println("Voc� est� com  " + quantidadePessoas + " pessoas.");

		if (idade >= 18 && acompanhado) {
			System.out.println("Entrada permitida.");
		} else {
			System.out.println("Menor de idade. Infelizmente n�o � permitida a entrada.");
		}
		
		

	}

}
