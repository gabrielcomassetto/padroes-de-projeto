package projetofinal.model.cliente;

public class ClientesBuilder {
	
	private Clientes clientes;
	
	
	public ClientesBuilder() {
		this.clientes = new Clientes();
	}
	
	
	public static ClientesBuilder builder() {
		return new ClientesBuilder();
	}
	
	public ClientesBuilder addNome(String nome) {
		this.clientes.setNome(nome);
		return this;
	}
	
	public ClientesBuilder addCpf(String cpf) {
		this.clientes.setCpf(cpf);
		return this;
	}
	
	public ClientesBuilder addDataNascimento(String dataNascimento) {
		this.clientes.setDataNascimento(dataNascimento);
		return this;
	}
	
	public ClientesBuilder addTelefone(String telefone) {
		this.clientes.setTelefone(telefone);
		return this;
	}
	
	public Clientes get() {
		return this.clientes;
	}

}