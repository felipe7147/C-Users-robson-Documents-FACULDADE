package modelo;

public class Carro extends Veiculo {
	private String tipo;

	public Carro(String cor, String modelo, String marca, String ano, String tipo) {
		super(cor, modelo, marca, ano);
		this.tipo = tipo;
	}
}
