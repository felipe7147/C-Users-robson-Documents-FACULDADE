package modelo;

public class Trator extends Veiculo {
 private String tipo;
 private String motor;
public String getTipo() {
	return tipo;
}
public Trator(String cor, String modelo, String marca, String ano, String tipo, String motor) {
	super(cor, modelo, marca, ano);
	this.tipo = tipo;
	this.motor = motor;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Trator [tipo=" + tipo + ", motor=" + motor + "]";
}
public String getMotor() {
	return motor;
}
public void setMotor(String motor) {
	this.motor = motor;
}
}
