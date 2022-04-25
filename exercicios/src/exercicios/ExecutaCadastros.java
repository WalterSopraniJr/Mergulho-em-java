package exercicios;

public class ExecutaCadastros {
	public static void main(String[] args) {
		Cadastro walter = new Cadastro();
		Pessoa walterPessoa = new Pessoa();
		
		
		walterPessoa.setNome("Walter Soprani Júnior");
		walterPessoa.setCPF("222.222.222-22");
		walterPessoa.setProfissao("Programador");
		
		//System.out.println("Endereço de memória de 'Cadastro': " + walter + " e de 'Pessoa': "+ walterPessoa);
		
		System.out.println("Nome: " + walterPessoa.getNome());
		System.out.println("CPF: " + walterPessoa.getCPF());
		System.out.println("Profissão: " + walterPessoa.getProfissao());
	}

}
