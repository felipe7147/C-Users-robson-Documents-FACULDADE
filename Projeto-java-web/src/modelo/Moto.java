package modelo;

public class Moto extends Veiculo {
	public String getCilindradas() {
		return cilindradas;
	}

	public Moto(String cor, String modelo, String marca, String ano, String cilindradas) {
		super(cor, modelo, marca, ano);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + "]";
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	private String cilindradas;
}
