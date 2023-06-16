package projetofinal.model.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import projetofinal.conexao.ConnectionFactory;

public class CadastroCliente {
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	
	public void novoCliente() {
		
		System.out.println("Digite o nome, cpf, data de nascimento e telefone do cliente.");
		ClientesBuilder builder = new ClientesBuilder()
                .addNome(sc.next())
                .addCpf(sc.next())
                .addDataNascimento(sc.next())
		 		.addTelefone(sc.next());
        		Clientes clientes = builder.get();

	          
	            try {
	                	Connection conn = ConnectionFactory.getConnection();
	                    String sql = "INSERT INTO tb_clientes (nome, cpf, datanascimento, telefone) VALUES (?, ?, ?, ?)";
	                    PreparedStatement pstm = conn.prepareStatement(sql);
	                    pstm.setString(1, clientes.getNome());	               
	                    pstm.setString(2, clientes.getCpf());
	                    pstm.setString(3, clientes.getDataNascimento());
	                    pstm.setString(4, clientes.getTelefone());

	                    pstm.executeUpdate();

	                    System.out.println("Cliente cadastrado no banco de dados.");
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	
				

	}
	

}
