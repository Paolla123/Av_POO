package Robo;

public class Robo {
	//atributos
	private int linha;
	private int coluna; 
	private int passos;
    private final int maxLinha = 20;
    private final int maxColuna = 40;

    // Construtor
    public Robo(int linha, int coluna, int passos) {
        this.linha = linha;
        this.coluna = coluna;
        this.passos = passos;
    }

    // metodos
    public void andarFrente() {
        this.linha += this.passos;
        if (this.linha >= this.maxLinha) {
        	this.linha = this.maxLinha - 1;
        }
    }

    public void andarTras() {
        this.linha -= this.passos;
        if (this.linha < 0) {
        	this.linha = 0;
        }
    }

    public void andarDireita() { 
        this.coluna += this.passos;   
        if (this.coluna >= this.maxColuna) {
        	this.coluna = this.maxColuna - 1;
        }
    }

    public void andarEsquerda() {
        coluna -= this.passos;
        if (this.coluna < 0) {
        	this.coluna = 0;
        }
    }
    
    public void mostrarPosicaoAtual() {
        System.out.println("Posição atual do robô: (" + this.linha + ", " + this.coluna + ")");
    }
  
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
}
