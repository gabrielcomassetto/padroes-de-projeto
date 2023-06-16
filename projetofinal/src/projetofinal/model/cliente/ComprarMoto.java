package projetofinal.model.cliente;


public class ComprarMoto {
	
	private MotoCompraStrategy compraStrategy;

    public ComprarMoto(MotoCompraStrategy compraStrategy) {
        this.compraStrategy = compraStrategy;
    }

    public void comprarMoto() {
        compraStrategy.comprarMoto();
    }

}
