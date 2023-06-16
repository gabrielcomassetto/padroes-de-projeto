package projetofinal.model.motos;

//Prototype
public abstract class MotosPrototype{
	
	protected double preço;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public abstract String infos();
	
	public abstract MotosPrototype clonar();
	
	
	
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getpreço() {
		return preço;
	}
	
	public void setpreço(double preço) {
		this.preço = preço;
	}

}
