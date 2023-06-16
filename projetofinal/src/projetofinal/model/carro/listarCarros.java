package projetofinal.model.carro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import projetofinal.conexao.ConnectionFactory;

public class listarCarros {
	
	public void listarCarrosDoBanco() {
	
		try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "SELECT * FROM tb_carros";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            ArrayList<Carros> carros = new ArrayList<>();
            while (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String preço = rs.getString("preço");
                int ano = rs.getInt("ano");

                carros.add(new Carros(marca, modelo, preço, ano));
            }

            Iterator<Carros> iterator = carros.iterator();

            while (iterator.hasNext()) {
                Carros carro = iterator.next();
                System.out.println("Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() +
                		"\nPreço: " + carro.getpreço() + "\nAno: " + carro.getAno() + "\n");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar carros do banco de dados: " + e.getMessage());
        }
		
	}
}
