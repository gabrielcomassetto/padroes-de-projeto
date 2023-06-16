package projetofinal.model.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import projetofinal.conexao.ConnectionFactory;
import projetofinal.model.carro.Carros;


public class ComandoCompraCarro implements Comando {
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

    private String modelo;

    public ComandoCompraCarro(String modelo) {
        this.modelo = modelo;
    }
    
    public void executar() {
    	try (Connection conn = ConnectionFactory.getConnection()) {
    	       System.out.print("Digite o modelo do carro para comprar: ");
    	        modelo = sc.nextLine();
    			
    	        String query = "SELECT * FROM tb_carros where modelo = ?";
    	        PreparedStatement statement = conn.prepareStatement(query);
    	        statement.setString(1, modelo);
    			ResultSet rs = statement.executeQuery();
    			
    			ArrayList<Carros> carros = new ArrayList<>();
    	        while (rs.next()) {
    	            String marca = rs.getString("marca");
    	            String modeloCarro = rs.getString("modelo");
    	            double preço = rs.getDouble("preço");
    				System.out.println("Carro da marca: " + marca + " e modelo: " + modelo + " comprado por: " + preço);
    			}
    		}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
