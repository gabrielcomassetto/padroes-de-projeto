package projetofinal.conexao;

import java.sql.Connection;
import java.sql.Statement;

public class CriarTabela {
	
	public void criaTabela() {
		 
		String tabela1 = "create table if not exists  tb_carros " + "( Marca varchar NOT NULL , "
				+ "  Modelo varchar NOT NULL , " + "  Preço varchar, " + "  Ano int)";
		
		String tabela2 = "create table if not exists  tb_motos " + "( marca varchar NOT NULL , "
				+ "  Modelo varchar NOT NULL , " + "  Preço varchar, " + "  Ano int)";
		
		String tabela3 = "create table if not exists  tb_clientes " + "( Nome varchar NOT NULL , "
				+ "  Cpf varchar NOT NULL , " + "  dataNascmimento varchar, " + "  Telefone varchar)";
		
		String tabela4 = "create table if not exists  tb_vendedores " + "( Nome varchar NOT NULL , Loja varchar)";
		
		
		try (Connection conn = ConnectionFactory.getConnection();
				Statement pstm = conn.createStatement())
		{
			pstm.execute(tabela1);
			pstm.execute(tabela2);
			pstm.execute(tabela3);
			pstm.execute(tabela4);
			System.out.println("Tabelas criadas com sucesso.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


