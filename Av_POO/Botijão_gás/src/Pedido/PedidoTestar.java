package Pedido;

import java.util.Scanner;
import java.util.ArrayList; 

public class PedidoTestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obs sob o codigo: ao testar o codigo no console, em alguns momentos será necessario precionar o enter dua vezes 
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Pedido> clientesPedidos = new ArrayList<Pedido>();
		
		
		int opc;
	
		do {
			System.out.println("----------------------------------");
			System.out.println("ENTREGAS BOTIJÃO DE GÁS");
			System.out.println("----------------------------------");
			System.out.println("1 - FAZER PEDIDO");
			System.out.println("2 - CONFIRMAR ENTREGA");
			System.out.println("3 - VER PEDIDOS CONFIRMADOS");
			System.out.println("4 - VER PEDIDOS ENTREGUES");
			System.out.println("5 - SAIR");
			System.out.println("Digite abaixo: "); 
			opc = leitor.nextInt();
			 
			switch(opc) {
			
			case 1:
				
				boolean reiniciar;
				
				do {
					reiniciar = false; 
					Pedido clientes = new Pedido();
					
					leitor.nextLine();
					System.out.println("Digite o seu endereço: ");
					clientes.setEndereco(leitor.nextLine());
					leitor.nextLine();
				
					System.out.println("Digite a hora da compra (formato 24h, apenas a hora): ");
					int hora = leitor.nextInt();
				
					System.out.println("Digite os minutos da compra: ");
					int minutos = leitor.nextInt();
				
					clientes.calculaHoraEntrega(hora, minutos);
					leitor.nextLine();
				
					System.out.println("Dados do pedido: ");
					System.out.println("Endereço: " + clientes.getEndereco());
					System.out.println("Hora da compra: " + clientes.gethoraC());
					System.out.println("1-ALTERAR DADOS, 2-CONFIRMAR DADOS");
					int vix = leitor.nextInt();
				
					if(vix == 1) {
						leitor.nextLine();
						System.out.println("ALTERANDO DADOS");
						System.out.println("Informe seu novo endereço: ");
						clientes.setEndereco(leitor.nextLine());
						leitor.nextLine();
					
						System.out.println("Continuação do Pedido...");
						System.out.println("Digite a quantidade de botijões de gás, que você deseja: ");
						clientes.setquantBotijoes(leitor.nextInt());
					
					}else if(vix == 2) {
						System.out.println("Continuação do Pedido...");
						System.out.println("Digite a quantidade de botijões de gás, que você deseja: ");
						clientes.setquantBotijoes(leitor.nextInt());
					}
				
					leitor.nextLine();
					System.out.println("FORMA DE PAGAMENTO E VALORES");
					System.out.println("---------------------------");
					System.out.println("1 - Pix/Espécie: R$ 105,00"); 
					System.out.println("2 - Cartão de Crédito: R$ 120,00");
					System.out.println("Digite: ");
					vix = leitor.nextInt();
					clientes.calculoCompra(vix);
				
					leitor.nextLine();
					System.out.println("TOTAL A SER PAGO: ");
					System.out.println(clientes.gettotalCompra()); 
				
					if(vix == 1) {
						leitor.nextLine();
						System.out.println("Chave Pix: 84 96666-6666 - Empresa Botijão de Gás");
						System.out.println("Caso a forma de pagamento seja em espécie, enviar o dinheiro pelo entregador!");
					}else if(vix == 2) {
						System.out.println("Digite, número do cartão: ");
						int cartão = leitor.nextInt();  
					}
				
					leitor.nextLine(); 
					System.out.println("STATUS ATUAL DA COMPRA:");
					System.out.println("---------------------------");
					clientes.exibirStatus();
				
					leitor.nextLine();
					System.out.println("Digite: 1 - Confirmar pedido, 2 - Não confirmar pedido" );
					int conf =  leitor.nextInt();
					leitor.nextLine(); 
				
					if(conf == 1){
						System.out.println(clientes.updateStatusC(conf));
						System.out.println("Codigo do seu pedido gerado: " + clientes.codigoPedido());
						leitor.nextLine();
					}else if(conf == 2){ 
						 System.out.println("Você escolheu não confirmar o pedido.");
				         System.out.println("Digite 1 para refazer o pedido:");
				            int refazer = leitor.nextInt();
				            leitor.nextLine(); 
				            
				            if (refazer == 1) { 
				                reiniciar = true; // Define que o pedido será refeito
				            }
				        }
				
					if (!reiniciar) {
			            	clientesPedidos.add(clientes); // Adiciona o cliente apenas se o pedido foi confirmado
			        }
				
				}while(reiniciar); 
				
				break;
				
			case 2:
				
				System.out.println("Digite o codigo do pedido: ");
				int busca = leitor.nextInt();
				for(int i=0; i<clientesPedidos.size(); i++) {
					if(clientesPedidos.get(i).buscarCodPedido(busca)) { 
						leitor.nextLine();
						System.out.println("Pedido encontrado");
						System.out.println("Atualizando Status do pedido para 'ENTREGUE'...");
						clientesPedidos.get(i).setstatusEntregue("Pedido Entregue"); 
						System.out.println("ATUALIZADO COM SUCESSO!"); 
						
						
					}else {
						System.out.println("Pedido/codigo não localizado.");
					} 
				}
				
				break;
				
			case 3:
				
				System.out.println("Digite o codigo do pedido: ");
				busca = leitor.nextInt();
				for(int i=0; i<clientesPedidos.size(); i++) {
					if(clientesPedidos.get(i).buscarCodPedido(busca)) { 
						System.out.println("Pedido encontrado");
						System.out.println("----------------------");
						System.out.println(clientesPedidos.get(i).statusPedido());
						
					}else {  
						System.out.println("Pedido/codigo não localizado."); 
					}
				}
				
				
				break;
				
			case 4:
				
				leitor.nextLine();
				System.out.println("Digite o codigo do pedido: ");
				busca = leitor.nextInt();
				for(int i=0; i<clientesPedidos.size(); i++) {
					if(clientesPedidos.get(i).buscarCodPedido(busca)) { 
						System.out.println("Pedido encontrado");
						System.out.println("-------------------------");
						System.out.println(clientesPedidos.get(i).toString());
						
					}else {  
						System.out.println("Pedido/codigo não localizado.");
					}
				}
				
				break;
				
			case 5:
				
				 System.out.println("Saindo do programa...");
			}
			
		}while(opc!=5);
		
	}

}
