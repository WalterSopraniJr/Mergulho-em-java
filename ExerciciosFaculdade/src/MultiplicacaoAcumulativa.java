import java.util.Scanner;

public class MultiplicacaoAcumulativa {

	public static void main(String[] args) {
		int multiplicacao = 1;
		int i, numeroInserido = 0;
		java.util.Scanner ler = new Scanner(System.in);
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite um numero do tipo inteiro para efetuar uma multiplica��o acumulativa: ");
			numeroInserido = ler.nextInt();
			multiplicacao *= numeroInserido;
		}
		
		System.out.println("Resultado da Multiplica��o: ");
		System.out.println(multiplicacao);

	}

}
