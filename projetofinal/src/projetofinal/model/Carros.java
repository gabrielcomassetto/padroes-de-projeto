package projetofinal.model;

//Factory Method
public class Carros {
	
	private String marca;
	private String modelo;
	private String pre�o;
	private int ano;
	

	public Carros(String marca, String modelo, String pre�o, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.pre�o = pre�o;
		this.ano = ano;
	}


	public static Carros criarCarro(String marca, String modelo, String pre�o, int ano) {
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
	public String getPre�o() {
		return pre�o;
	}
	public void setPre�o(String pre�o) {
		this.pre�o = pre�o;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	

}
