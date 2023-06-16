package projetofinal.model.motos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import projetofinal.conexao.ConnectionFactory;

public class criarNovaMoto {

	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	
	public void criarMoto() {
		
		HDPrototype hd = new HDPrototype();
		MotosPrototype hdNova = hd.clonar();
		
		ArrayList<MotosPrototype> motos = new ArrayList<>();
		
		System.out.println("Digite a marca da moto: ");
		hdNova.setMarca(sc.next());
		System.out.println("Digite o modelo da moto: ");
		hdNova.setModelo(sc.next());
		System.out.println("Digite o valor da moto: ");
		hdNova.setpreço(sc.nextDouble());
		System.out.println("Digite o ano da moto: ");
		hdNova.setAno(sc.nextInt());
		
		motos.add(hdNova);
		
		String sql = "INSERT INTO tb_motos(marca, modelo, preço, ano) VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.getConnection();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, hdNova.getMarca());
			pstm.setString(2, hdNova.getModelo());
			pstm.setDouble(3, hdNova.getpreço());
			pstm.setInt(4, hdNova.getAno());
			
			
			
			pstm.execute();
			System.out.println("Nova moto cadastrada no sistema.");

		
			System.out.println(hdNova.infos());
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {

		try {
			if(pstm!=null) {
				pstm.close();
			}
			
			if(conn!=null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
}


