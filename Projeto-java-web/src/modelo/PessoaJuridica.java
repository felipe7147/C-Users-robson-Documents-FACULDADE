package modelo;

public class PessoaJuridica extends Pessoa {
	private String CNPJ ;
	private String nomeFantasia;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public PessoaJuridica(String nome, String email, String cNPJ, String nomeFantasia) {
		super(nome, email);
		CNPJ = cNPJ;
		this.nomeFantasia = nomeFantasia;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [CNPJ=" + CNPJ + ", nomeFantasia=" + nomeFantasia + "]";
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
