package projetofinal.model.carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import projetofinal.conexao.ConnectionFactory;

public class criarCarro {
	
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	
	public void criarNovoCarro() throws SQLException {
		
	ArrayList<Carros> carros = new ArrayList<>();
	
	System.out.println("Digite a marca do carro: ");
	carros.add(Carros.criarCarro(sc.next(), null, null, 0));
	System.out.println("Digite o modelo do carro: ");
	carros.add(Carros.criarCarro(null, sc.next(), null, 0));
	System.out.println("Digite o preço do carro: ");
	carros.add(Carros.criarCarro(null, null, sc.next(), 0));
	System.out.println("Digite o ano do carro: ");
	carros.add(Carros.criarCarro(null, null, null, sc.nextInt()));
	
	
	adicionarCarrosAoBanco(carros);
	
	}
	
	public static void adicionarCarrosAoBanco(ArrayList<Carros> carros) throws SQLException {
		try (Connection conn = ConnectionFactory.getConnection()) {
			
            String sql = "INSERT INTO tb_carros (marca, modelo, preço, ano) VALUES (?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Carros carro : carros) {
                pstm.setString(1, carro.getMarca());
                pstm.setString(2, carro.getModelo());
                pstm.setString(3, carro.getPreço());
                pstm.setInt(4, carro.getAno());
                pstm.executeUpdate();
            }
            System.out.println("Carros adicionados ao banco de dados com sucesso!");
		}
		catch (SQLException e) {
            System.out.println("Erro ao adicionar carros ao banco de dados: " + e.getMessage());
        }
	
	
	}
	
	
	

}
