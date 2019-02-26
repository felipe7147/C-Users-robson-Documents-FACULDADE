package modelo;

public class Endereço {
 private String rua;
 private String bairro;

public Endereço(String rua, String bairro, String cidade, String uF) {
	super();
	this.rua = rua;
	this.bairro = bairro;
	this.cidade = cidade;
	UF = uF;
}
public String toString() {
	return "Endereço [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", UF=" + UF + "]";
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getUF() {
	return UF;
}
public void setUF(String uF) {
	UF = uF;
}
private String cidade;
 private String UF;
}
