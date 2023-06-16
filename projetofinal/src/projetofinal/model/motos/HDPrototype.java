package projetofinal.model.motos;

public class HDPrototype extends MotosPrototype{
	
	protected HDPrototype(HDPrototype hdPrototype) {
		this.ano = hdPrototype.getAno();
		this.marca = hdPrototype.getMarca();
		this.modelo = hdPrototype.getModelo();
		this.preço = hdPrototype.getpreço();
	}
	
	
	

	public HDPrototype() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String infos() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\npreço: " + getpreço();
	} 

	@Override
	public MotosPrototype clonar() {
		return new HDPrototype(this);
	}
	
	

}
