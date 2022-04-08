
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//int guarda 32 bits
		//long guarda 64 bits
		//short guarda 16 bits
		//byte guarda 8 bits
		
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        
        float pontoFlutuante = 3.14f;
	}

}
