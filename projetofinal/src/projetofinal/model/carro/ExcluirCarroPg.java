package projetofinal.model.carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import projetofinal.conexao.ConnectionFactory;



public class ExcluirCarroPg extends ExcluirCarro{
	
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));

	@Override
	protected void excluirCarroDoBanco() {
		try (Connection conn = ConnectionFactory.getConnection()) {
		       System.out.print("Digite o modelo do carro para exclusao: ");
		       String modelo = sc.nextLine();
				
		        String query = "DELETE FROM tb_carros where modelo = ?";
		        PreparedStatement statement = conn.prepareStatement(query);
		        statement.setString(1, modelo);
				statement.executeUpdate();
				
				System.out.println("Carro excluido com sucesso.");
				
				
			}catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	

}
