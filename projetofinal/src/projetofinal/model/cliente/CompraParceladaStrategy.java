package projetofinal.model.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import projetofinal.conexao.ConnectionFactory;
import projetofinal.model.motos.MotosPrototype;

public class CompraParceladaStrategy implements MotoCompraStrategy{
	
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	
	@Override
    public void comprarMoto() {
        try (Connection conn = ConnectionFactory.getConnection()) {
           System.out.print("Digite o modelo da moto para compra parcelada: ");
            String modelo = sc.nextLine();
			
            String query = "SELECT * FROM tb_motos where modelo = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, modelo);
			ResultSet rs = statement.executeQuery();

            ArrayList<MotosPrototype> motos = new ArrayList<>();
            while (rs.next()) {
                String marca = rs.getString("marca");
                String modeloCarro = rs.getString("modelo");
                double preço = rs.getDouble("preço");
				System.out.println("Moto da marca: " + marca + " e modelo: " + modelo + " comprada por: " + preço + " parcelada.");
			}
		}catch (Exception e) {
			e.printStackTrace();
	}
}

}
