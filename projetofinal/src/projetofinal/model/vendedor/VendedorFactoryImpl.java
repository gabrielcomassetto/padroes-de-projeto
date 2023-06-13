package projetofinal.model.vendedor;

public class VendedorFactoryImpl implements VendedorFactory{

	@Override
	public VendedorLoja criarVendedor() {
		return new VendedorLoja();
	}
	
	

}
