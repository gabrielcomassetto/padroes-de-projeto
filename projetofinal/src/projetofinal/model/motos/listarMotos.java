package projetofinal.model.motos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import projetofinal.conexao.ConnectionFactory;


public class listarMotos {
	
public static void listarMotosDoBanco() {
		
		try (Connection conn = ConnectionFactory.getConnection()) {
            String query = "SELECT * FROM tb_motos";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            ArrayList<MotosPrototype> motos = new ArrayList<>();
            while (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                double preço = rs.getDouble("preço");
                int ano = rs.getInt("ano");

                motos.add(marca, modelo, preço, ano);
            }

            Iterator<MotosPrototype> iterator = motos.iterator();

            while (iterator.hasNext()) {
                MotosPrototype moto = iterator.next();
                System.out.println("Marca: " + moto.getMarca() + ", Modelo: " + moto.getModelo());
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar motos do banco de dados: " + e.getMessage());
        }
		
	}

}
