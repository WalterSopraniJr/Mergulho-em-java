
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; //guarda uma letra. No fundo é o código unicode
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		valor = (char) (valor +1);
		System.out.println(valor);
		
		//String com letra maiuscula não é palavra chave do Java, é um tipo referência.
		
		String palavra = "Isso é uma frase. ";
		System.out.println(palavra);
		
		palavra = palavra + 2022; //converte o num para string
		System.out.println(palavra);
	}
	
}
