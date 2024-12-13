package JogoAposta;

import java.util.Random;

public class JogoAposta {
	
	//Atributos 
	private String nome;
	private int numAposta;
	private int dado1;
	private int dado2;
	private int numSortido;
	private int pontuacao;   
	private int pontoMaq;
	private int quantVM;
	private int quantVitorias;
	
	//metodos  
	
	public int JogarDado() {
		Random rand = new Random();
	    return 1 + rand.nextInt(6); // Gera um número entre 1 e 6
	    
	}
	
	public void NumeroSortido() {
        this.dado1 = JogarDado();
        this.dado2 = JogarDado();
        this.numSortido = this.dado1 + this.dado2;
    }
	
	public void Raking() {
		if(this.nome == null && this.quantVitorias == 0) {
			System.out.println("RAKING DE VITORIAS");
			System.out.println("--------------------------");
			System.out.println("Nome: Sem Jogadores");
			System.out.println("Quantidade de vitorias: 000");
		}else {	
			System.out.println("RAKING DE VITORIAS");
			System.out.println("--------------------------");
			System.out.println("Nome: " + this.nome);
			System.out.println("Quantidade de Pontuação: " + this.pontuacao);
			System.out.println("Quantidade de vitorias: " + this.quantVitorias);
		}
	}

	public boolean validarVencedor() {
		boolean test = false;
		
			if(this.numAposta == this.numSortido) {
				test = true;
				this.pontuacao += 1;
			} else {
				test = false;
				this.pontoMaq += 1; 
			}
		return test; 
	}
	
	public void registrarVitorias() {
		this.quantVitorias += 1;
	}
	
	public void MaquinaObjt() {
		System.out.println("Nome: Maquina");
		System.out.println("Pontuação: " + this.pontoMaq);
		System.out.println("Vitorias: " + this.quantVM);
		
	}
	
	public String exibirInfo() {
		
			return "Nome: " + this.nome + "\n" +
				   "Numero Apostado: " + this.numAposta + "\n" +
				   "Pontuação: " + this.pontuacao;   
				 
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + this.nome + "\n" +
			   "Numero Apostado: " + this.numAposta + "\n" +
			   "Quantidade de Pontuação: " + this.pontuacao + "\n" +
			   "Quantidade de vitorias: " + this.quantVitorias; 
	} 
	
	
	//construtor vazio 
	JogoAposta() {
		
	}
	
	//getters e setters 
	public String getNome() {
		return this.nome; 
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumAposta() {
		return this.numAposta; 
	}
	public void setNumAposta(int numAposta) {
		this.numAposta = numAposta;
	}
	public int getPontuação() {
		return this.pontuacao; 
	}
	public void setPontuação(int pontuação) {
		this.pontuacao = pontuação;
	}
	public int getQuantVitorias() {
		return this.quantVitorias; 
	}
	public void setQuantVitorias(int quantVitorias) {
		this.quantVitorias = quantVitorias;
	}
	
	public int getQuantVM() {
		return quantVM;
	}

	public void setQuantVM(int quantVM) {
		this.quantVM = quantVM;
	}

	public int getDado1() {
		return dado1;
	}
	public int getDado2() {
		return dado2;
	}
	public int getNumeroSortido() {
		return numSortido; 
	}
	
	
	
}
