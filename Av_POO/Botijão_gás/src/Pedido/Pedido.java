package Pedido;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.time.LocalTime;


public class Pedido {
	//atributos
	private String endereco;
	private String statusConfirma;
	private String statusEntregue; 
	private LocalTime horaC;
	private LocalTime horaEntrega; 
	private int quantBotijoes;
	private float totalCompra;
	private int codPedido;
	private static Set<Integer> codigosGerados = new HashSet<>();
	
	//metodos
	public float calculoCompra(int opc) {
		if(opc == 1) {
			this.totalCompra = (this.quantBotijoes * 105);
		}else if(opc == 2) {
			this.totalCompra = (this.quantBotijoes * 120);
		}
		return this.totalCompra;  
	}
	
	public LocalTime calculaHoraEntrega(int hora, int minuto) {
		 this.horaC = LocalTime.of(hora, minuto);  
		 this.horaEntrega = this.horaC.plusHours(6);   
		 return this.horaEntrega;  
	}
	
	public int codigoPedido() {
		 Random rand = new Random();
		 
		 	do {
	            this.codPedido = 10000 + rand.nextInt(90000);
	        } while (codigosGerados.contains(this.codPedido)); 
		  
		return this.codPedido; 
	}
	
	public String updateStatusC(int confirmar) {
		//atributos com valores eventualmente inicializados
		//this.statusConfirma = "Pedido não confirmado"; 
		this.statusEntregue = "Pedido não entregue";
		
		if(confirmar == 1){
			this.statusConfirma = "Pedido confirmado";
		}else {
			this.statusConfirma = "Pedido não confirmado";
		}
		 
		return this.statusConfirma;
	}
	
	public boolean buscarCodPedido(int codPedido){
		boolean encontrado = false;  
		if(codPedido == this.codPedido) {
			encontrado = true;
		}
		
		return encontrado; 
	}
	

	public void exibirStatus() {
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Hora da compra: " + this.horaC);
		System.out.println("Quantidade de Botijões: " + this.quantBotijoes);
		System.out.println("Prazo de entrega: " + "até às " + this.horaEntrega ); 
		System.out.println("Total da compra: " + this.totalCompra); 
		
	}
	
	public String statusPedido() {
		
		return "Codigo Pedido: " + this.codPedido + "\n" +
			   "Endereço: " + this.endereco + "\n" +
			   "Hora da compra: " + this.horaC + "\n" +
			   "Quantidade de Botijões: " + this.quantBotijoes + "\n" +
			   "Total da Compra: " + this.totalCompra + "\n" +  
			   "Status do Pedido: " + this.statusConfirma;
	} 
	
	@Override
	public String toString() {
		 return "Codigo Pedido: " + this.codPedido + "\n" +
		 		"Endereço: " + this.endereco + "\n" +
				"Hora da compra: " + this.horaC + "\n" +
				"Quantidade de Botijões: " + this.quantBotijoes + "\n" +
				"Total da Compra: " + this.totalCompra + "\n" +
				"Hora de entrega: " + this.horaEntrega + "\n" +
				"Status do Pedido: " + this.statusConfirma + "," + this.statusEntregue;  
	}
	
	//construtor vazio 
	Pedido(){
	}
	
	//getters e setters 
	public void setEndereco(String endereco) {
		this.endereco = endereco; 
	}
	
	public String getEndereco() {
		return this.endereco; 
	} 
	
	public void setquantBotijoes(int quantBotijoes) {
		this.quantBotijoes = quantBotijoes;
	}
	
	public int getquantBotijoes() {
		return this.quantBotijoes; 
	}
	
	public void settotalCompra(float totalCompra) {
		this.totalCompra = totalCompra; 
	}
	
	public float gettotalCompra() {
		return this.totalCompra; 
	}
	
	public void setstatusConfirmar(String statusConfirma) {
		this.statusConfirma = statusConfirma;
	}
	
	public String getstatusConfirma() {
		return this.statusConfirma;   
	}
	
	public void setstatusEntregue(String statusEntregue) {
		this.statusEntregue = statusEntregue;
	}
	
	public int getcodPedido() {
		return this.codPedido;  
	}
	
	public LocalTime gethoraC() {
		return this.horaC; 
	}
	
	
	public LocalTime gethoraEntrega() {
		return this.horaEntrega; 
	}
	
	
}
