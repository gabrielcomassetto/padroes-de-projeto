package projetofinal.model.motos;

public class HDPrototype extends MotosPrototype{
	
	protected HDPrototype(HDPrototype hdPrototype) {
		this.ano = hdPrototype.getAno();
		this.marca = hdPrototype.getMarca();
		this.modelo = hdPrototype.getModelo();
		this.preço = hdPrototype.getPreço();
	}
	
	
	

	public HDPrototype() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String infos() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nPreço: " + getPreço();
	} 

	@Override
	public MotosPrototype clonar() {
		return new HDPrototype(this);
	}
	
	

}
