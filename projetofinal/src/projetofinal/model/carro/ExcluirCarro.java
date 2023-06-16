package projetofinal.model.carro;

public abstract class ExcluirCarro {
	
	 public void excluirCarro() {
		 excluirCarroDoBanco();
	 }

	protected abstract void excluirCarroDoBanco();

}
