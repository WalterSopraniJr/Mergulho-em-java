
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a'; //guarda uma letra. No fundo � o c�digo unicode
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		valor = (char) (valor +1);
		System.out.println(valor);
		
		//String com letra maiuscula n�o � palavra chave do Java, � um tipo refer�ncia.
		
		String palavra = "Isso � uma frase. ";
		System.out.println(palavra);
		
		palavra = palavra + 2022; //converte o num para string
		System.out.println(palavra);
	}
	
}
