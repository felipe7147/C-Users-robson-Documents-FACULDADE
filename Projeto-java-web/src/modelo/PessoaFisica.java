package modelo;

public class PessoaFisica extends Pessoa {
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public PessoaFisica(String nome, String email, String cPF) {
		super(nome, email);
		CPF = cPF;
	}

	
	public String toString() {
		return "PessoaFisica [CPF=" + CPF + "][nome=\" + nome + \", email=\" + email + \"]\"";
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
