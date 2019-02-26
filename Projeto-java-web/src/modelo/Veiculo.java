package modelo;

import java.util.ArrayList;

public  class Veiculo {
	private String cor;
	private String modelo;
	private String marca;
	private String ano;
	public static ArrayList Veiculo = new ArrayList();
	
	public Veiculo(String cor, String modelo, String marca, String ano) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String toString() {
		return "Cor: " + this.cor + ", Modelo: " + this.modelo + ", marca " + this.marca + ", ano" + this.ano;
}
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}