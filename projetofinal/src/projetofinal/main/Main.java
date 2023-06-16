package projetofinal.main;

import java.sql.SQLException;
import java.util.Scanner;

import projetofinal.conexao.CriarTabela;
import projetofinal.model.carro.ExcluirCarro;
import projetofinal.model.carro.ExcluirCarroPg;
import projetofinal.model.carro.criarCarro;
import projetofinal.model.carro.listarCarros;
import projetofinal.model.cliente.CadastroCliente;
import projetofinal.model.cliente.Comando;
import projetofinal.model.cliente.ComandoCompraCarro;
import projetofinal.model.cliente.CompraAVistaStrategy;
import projetofinal.model.cliente.CompraParceladaStrategy;
import projetofinal.model.cliente.ComprarMoto;
import projetofinal.model.cliente.Invocador;
import projetofinal.model.cliente.MotoCompraStrategy;
import projetofinal.model.motos.criarNovaMoto;
import projetofinal.model.motos.listarMotos;
import projetofinal.model.vendedor.CriarVendedor;

public class Main {
	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
	public static void main(String[] args) throws SQLException {
		
		CriarTabela ct = new CriarTabela();
	//	ct.criaTabela();
		

		
		new Main().menu();
	}
		private void menu() throws SQLException {
			Main opc = new Main();
			
			int opçao = 0;
			while(opçao != 9) {
					System.out.println("----------------------------------");
					System.out.println("Escolha uma opção: ");
					System.out.println("1 - Sou adminsitrador. ");
					System.out.println("2 - Sou cliente. ");
					System.out.println("3 - Sou vendedor. ");
					System.out.println("9 - Encerrar. ");
					System.out.println("----------------------------------");
					int opcao = sc.nextInt();
					
					if (opcao == 9) {
						break;
					}
					switch (opcao) {
					case 1:
						opc.Adm();
						break;
					case 2:
						opc.Cliente();
						break;
					case 3:
						opc.Vendedor();
						break;
					default:
					
					}
				}
			}
			
			private void Adm(){
				Main adm = new Main();
				int opcao = 0;
				while(opcao != 9){
					System.out.println("1 - Para cadastrar vendedor");
					System.out.println("2 - Para excluir carro");
					System.out.println("9 - Para sair");
					opcao = sc.nextInt();
					
					if(opcao == 9){
						break;
					}
					switch(opcao){
						case 1:
						adm.criarVendedor();
						break;
						case 2:
						adm.deletarCarro();
						break;
					default:
					}
				}
			}
			

			private void Cliente(){
				Main opc = new Main();
				int opcao = 0;
				while(opcao != 9){
					System.out.println("1 - Para comprar carro");
					System.out.println("2 - Para comprar moto a vista");
					System.out.println("3 - Para comprar moto parcelada");
					System.out.println("4 - Para alugar carro");
					System.out.println("5 - Para alugar moto");
					System.out.println("9 - Para sair");
					opcao = sc.nextInt();
					
					if(opcao == 9){
						break;
					}
					
					switch(opcao){
						case 1:
						opc.comprarCarro();
						break;
						case 2:
						opc.compraMotoaVista();
						break;
						case 3:
						opc.compraMotoParcelada();
						break;
						case 4:
					//	opc.alugarMoto();
					}
					
				}
			}
			
			
	
			private void Vendedor() throws SQLException{
				Main opc = new Main();
				int opcao = 0;
				while(opcao != 9){
					System.out.println("1- Cadastrar um carro");
					System.out.println("2- Para cadastrar um novo cliente");
					System.out.println("3- Para cadastrar uma nova moto");
					System.out.println("4- Para listar carros da loja");
					System.out.println("5- Para listar motos da loja");
					System.out.println("9 - Para sair");
					opcao = sc.nextInt();
					
					if(opcao == 9){
						break;
					}
				
				
					switch(opcao){
					case 1:
						opc.cadastrarCarro();
						break;
						case 2:
						opc.cadastrarCliente();
						break;
						case 3:
						opc.cadastrarMoto();
						break;
						case 4:
						opc.listarCarros();
						break;
						case 5:
						opc.listarMotos();
						break;
						default:
					}	
				}
			}
			
			
			void cadastrarCarro() throws SQLException {
				criarCarro cc = new criarCarro();
				cc.criarNovoCarro();
			}
			
			void cadastrarMoto() {
				criarNovaMoto cm = new criarNovaMoto();
				cm.criarMoto();
			}
			
			void cadastrarCliente() {
				CadastroCliente ccli = new CadastroCliente();
				ccli.novoCliente();
			}
			
			void listarCarros() {
				listarCarros lc = new listarCarros();
				lc.listarCarrosDoBanco();
					
				}
			
			void listarMotos() {
				listarMotos lm = new listarMotos();
				lm.listarMotosDoBanco();
			}
			
			void criarVendedor() {
				CriarVendedor cv = new CriarVendedor();
				cv.criarVendedor();
			}
			
			void compraMotoaVista() {
				MotoCompraStrategy compraAVista = new CompraAVistaStrategy();
		        ComprarMoto moto1 = new ComprarMoto(compraAVista);
		        moto1.comprarMoto();
			}
			
			void compraMotoParcelada() {
				MotoCompraStrategy compraParcelada = new CompraParceladaStrategy();
		        ComprarMoto moto2 = new ComprarMoto(compraParcelada);
		        moto2.comprarMoto();
			}
			
			void deletarCarro() {
				ExcluirCarro excluir = new ExcluirCarroPg();
				excluir.excluirCarro();
				
			}
			
			void comprarCarro() {
		        Comando compraCarro = new ComandoCompraCarro("Mustang");
		        Invocador invocador = new Invocador();
		        invocador.adicionarComando("compra", compraCarro);
		        invocador.executarComando("compra");
		        }
		 }

	
	
