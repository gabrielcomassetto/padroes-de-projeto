package projetofinal.main;

import projetofinal.model.Carros;
import projetofinal.model.Clientes;
import projetofinal.model.ClientesBuilder;

public class Main {
	
	public static void main(String[] args) {
		criarCarros();
		criarClientes();
	}
	
	public static void criarCarros() {
		Carros carro1 = Carros.criarCarro("Honda", "Civic EX", "R$27,999", 2001);
		System.out.println("Marca: " + carro1.getMarca() +"\n" +
				"Modelo: " + carro1.getModelo() + "\n" +
				"Preço: " + carro1.getPreço() + "\n" +
				"Ano: " + carro1.getAno());
	}
	
	public static void criarClientes() {
        ClientesBuilder builder = new ClientesBuilder()
                .addNome("João")
                .addCpf("12346")
                .addTelefone("123456789")
                .addDataNascimento("30/03/1995");
        
        Clientes clientes = builder.get();
        
        System.out.println(clientes.toString());
		
    }

}
