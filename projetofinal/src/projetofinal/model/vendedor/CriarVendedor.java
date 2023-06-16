package projetofinal.model.vendedor;

public class CriarVendedor {

	public void criarVendedor() {
		VendedorFactory vendedorFabrica = new VendedorFactoryImpl();
		Vendedores vendedores = vendedorFabrica.criarVendedor();
		vendedores.exibirInfoVendedor();
	}
	
}
