import java.util.Scanner;

public class RepeticaDeMultiplicacao {
	
	public static void main(String[] args) {
		
		int multiplicacao = 1;
		int i = 1;
		int numeroInserido = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero do tipo inteiro para efetuar uma multiplica��o acumulativa: ");
			numeroInserido = ler.nextInt();
			multiplicacao *= numeroInserido;
			i++;
			
		} while (i <= 5);
		
		System.out.println("Resultado da Multiplica��o: ");
		System.out.println(multiplicacao);

	}

}
