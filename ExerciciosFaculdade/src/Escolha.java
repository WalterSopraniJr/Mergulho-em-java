import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcoes;
		float num = 0, resultado;
		
		System.out.println("Opções");
		System.out.println("1 - Calcula o dobro do número ");
		System.out.println("2 - Calcula o triplo do número ");
		System.out.println("Escolha uma opção: ");
		opcoes = entrada.nextInt();
		System.out.println("Digite um número");
		num = entrada.nextFloat();
		
		switch(opcoes) {
		
		case 1:
			resultado = num * 2;
			System.out.println("Dobro: " + resultado);
			break;
		case 2:
			resultado = num * 3;
			System.out.println("Triplo: " + resultado);
			break;
		}
	}
}
