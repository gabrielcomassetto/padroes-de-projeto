package projetofinal.model.motos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import projetofinal.conexao.ConnectionFactory;


public class listarMotos {
	
public void listarMotosDoBanco() {
		
		try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "SELECT * FROM tb_motos";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String marca = rs.getString("Marca");
                String modelo = rs.getString("Modelo");
                String preço = rs.getString("Preço");
                int ano = rs.getInt("Ano");
                System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPreço: " + preço + "\nAno: " + ano);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar motos do banco de dados: " + e.getMessage());
        }
		
	}

}
