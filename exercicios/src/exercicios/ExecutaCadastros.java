package exercicios;

public class ExecutaCadastros {
	public static void main(String[] args) {
		Cadastro walter = new Cadastro();
		Pessoa walterPessoa = new Pessoa();
		System.out.println("Endereço de memória de 'Cadastro': " + walter + " e de 'Pessoa': "+ walterPessoa);
		walterPessoa.setNome("Walter Soprani Júnior");
		System.out.println(walterPessoa.getNome());
		
	}

}
