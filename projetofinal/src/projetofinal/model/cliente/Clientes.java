package projetofinal.model.cliente;

//Builder
public class Clientes {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Clientes [Nome: " + nome + ", Cpf: " + cpf + ", Data de Nascimento: " + dataNascimento + ", Telefone: "
				+ telefone + "]";
	}
	
	
	
	

	

}
