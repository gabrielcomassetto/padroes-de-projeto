package projetofinal.model.carro;

//Factory Method
public class Carros {
	
	private String marca;
	private String modelo;
	private double pre�o;
	private int ano;
	

	public Carros(String marca, String modelo, double pre�o, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.pre�o = pre�o;
		this.ano = ano;
	}


	public Carros() {
		// TODO Auto-generated constructor stub
	}


	public static Carros criarCarro(String marca, String modelo, double pre�o, int ano) {
		return new Carros(marca,modelo,pre�o,ano);
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	

}
