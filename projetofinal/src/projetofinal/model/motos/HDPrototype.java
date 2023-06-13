package projetofinal.model.motos;

public class HDPrototype extends MotosPrototype{
	
	protected HDPrototype(HDPrototype hdPrototype) {
		this.ano = hdPrototype.getAno();
		this.marca = hdPrototype.getMarca();
		this.modelo = hdPrototype.getModelo();
		this.pre�o = hdPrototype.getPre�o();
	}
	
	
	

	public HDPrototype() {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String infos() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nPre�o: " + getPre�o();
	} 

	@Override
	public MotosPrototype clonar() {
		return new HDPrototype(this);
	}
	
	

}
