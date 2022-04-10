//O desafio consiste em imprimir os multiplos de 3 dentro de 1 a 100


public class DesafioMultiplos3 {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
