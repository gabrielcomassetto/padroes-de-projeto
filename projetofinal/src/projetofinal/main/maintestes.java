package projetofinal.main;

import java.util.ArrayList;
import java.util.Scanner;

public class maintestes {
	
	 public static void main(String[] args) {
	        // Criação da lista de carros
	        ArrayList<Carro> carros = new ArrayList<>();

	        // Adicionar um novo carro usando informações do teclado
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Informe a marca do carro:");
	        String marca = scanner.nextLine();

	        System.out.println("Informe o modelo do carro:");
	        String modelo = scanner.nextLine();

	        Carro novoCarro = Carro.criarCarro(marca, modelo);
	        carros.add(novoCarro);

	        System.out.println("Novo carro adicionado com sucesso!");

	        // Listagem dos carros
	        System.out.println("Lista de carros:");
	        for (Carro carro : carros) {
	            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
	        }
	    }

}
