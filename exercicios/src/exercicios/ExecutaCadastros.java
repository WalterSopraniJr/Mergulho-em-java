package exercicios;

public class ExecutaCadastros {
	public static void main(String[] args) {
		Cadastro walter = new Cadastro();
		Pessoa walterPessoa = new Pessoa();
		System.out.println("Endere�o de mem�ria de 'Cadastro': " + walter + " e de 'Pessoa': "+ walterPessoa);
		walterPessoa.setNome("Walter Soprani J�nior");
		System.out.println(walterPessoa.getNome());
		
	}

}
