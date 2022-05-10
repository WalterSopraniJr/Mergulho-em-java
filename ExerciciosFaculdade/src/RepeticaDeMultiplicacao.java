import java.util.Scanner;

public class RepeticaDeMultiplicacao {
	
	public static void main(String[] args) {
		
		int multiplicacao = 1;
		int i = 1;
		int numeroInserido = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero do tipo inteiro para efetuar uma multiplicação acumulativa: ");
			numeroInserido = ler.nextInt();
			multiplicacao *= numeroInserido;
			i++;
			
		} while (i <= 5);
		
		System.out.println("Resultado da Multiplicação: ");
		System.out.println(multiplicacao);

	}

}
