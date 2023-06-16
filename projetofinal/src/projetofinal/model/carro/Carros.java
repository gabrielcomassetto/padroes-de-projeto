package projetofinal.model.carro;

//Factory Method
public class Carros {
	
	private String marca;
	private String modelo;
	private String preço;
	private int ano;
	

	public Carros(String marca, String modelo, String preço, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.preço = preço;
		this.ano = ano;
	}


	public Carros() {
		// TODO Auto-generated constructor stub
	}


	public static Carros criarCarro(String marca, String modelo, String preço, int ano) {
		return new Carros(marca,modelo,preço,ano);
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
	public String getpreço() {
		return preço;
	}
	public void setpreço(String preço) {
		this.preço = preço;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	

}
