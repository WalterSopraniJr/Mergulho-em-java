package exercicios;

public class ExecutaCadastros {
	public static void main(String[] args) {
		Cadastro walter = new Cadastro();
		Pessoa walterPessoa = new Pessoa();
		
		
		walterPessoa.setNome("Walter Soprani J�nior");
		walterPessoa.setCPF("222.222.222-22");
		walterPessoa.setProfissao("Programador");
		
		//System.out.println("Endere�o de mem�ria de 'Cadastro': " + walter + " e de 'Pessoa': "+ walterPessoa);
		
		System.out.println("Nome: " + walterPessoa.getNome());
		System.out.println("CPF: " + walterPessoa.getCPF());
		System.out.println("Profiss�o: " + walterPessoa.getProfissao());
	}

}
