import java.util.Scanner;

public class ComparaNumeros {

	public static void main(String[] args) {
		int primeiroNumero, segundoNumero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira um numero inteiro: \n");
		primeiroNumero = ler.nextInt();
		System.out.println("Insira um numero inteiro: \n");
		segundoNumero = ler.nextInt();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O primeiro n�mero inserido � maior");
		} else {
			System.out.println("O segundo n�mero inserido � maior");
		}
	}

}
