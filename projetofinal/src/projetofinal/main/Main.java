package projetofinal.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import projetofinal.model.Carros;
import projetofinal.model.Clientes;
import projetofinal.model.ClientesBuilder;
import projetofinal.model.HDPrototype;
import projetofinal.model.MotosPrototype;

public class Main {
	
	public static void main(String[] args) {
		criarCarros();
		criarClientes();
		criarMotos();
	}
	
	
	public static void criarCarros() {
		List<Carros> carros = new ArrayList<>();
		carros.add(Carros.criarCarro("Honda", "Civic EX", 27.999, 2001));
		carros.add(Carros.criarCarro("BMW", "330I M", 105.000, 2016));

		
		Iterator<Carros> iterator = carros.iterator();
		while(iterator.hasNext()) {
			Carros carro = iterator.next();
			System.out.println("Marca: " + carro.getMarca() +"\n" +
					"Modelo: " + carro.getModelo() + "\n" +
					"Preço: R$ " + carro.getPreço() + "\n" +
					"Ano: " + carro.getAno());
		}
		
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
	
	public static void criarMotos() {
		HDPrototype hd = new HDPrototype();
		MotosPrototype hdNova = hd.clonar();
		hdNova.setAno(1998);
		hdNova.setMarca("Harley-Davidson");
		hdNova.setModelo("Dyna FX Low");
		hdNova.setPreço(63000);
		
		System.out.println(hdNova.infos());
	}

}
