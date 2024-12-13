package AnimaisZoo;

//Classe concreta C3

class Ave extends Animal implements ExibirDados, Comportamento{
	
	protected String tipoDePena; 
	
	 public Ave(String nome, int idade, String tipoDePena) {
	        super(nome, idade);   
	        this.tipoDePena = tipoDePena;
	 }
	
	String getNome() {
		return "Nome do Animal: " + this.Nome;   
	}
	 
	String getIdade() {
		return "Idade do Animal: " + this.Idade; 
	}  

	
	// Implementação do método da interface ExibirDados
	@Override
	public void exibirInfo() {    
		System.out.println("Nome: " + this.Nome); 
		System.out.println("Idade: " + this.Idade + " Ano"); 
		System.out.println("Tipo de pena: " + this.tipoDePena);   
	}
	
	// Implementação dos metodos Comportamento
	@Override
    public void dormir() {
        System.out.println("Comportamento: " + this.Nome + " está dormindo no ninho.");
    }
	 
	@Override
	public void comer() {
	    System.out.println("Comportamento: " + this.Nome + " está comendo sementes."); 
	}
	
	//Implementação do metodo abstrato da classe mãe ANIMAL 
	@Override  
	void emitirSom() {
		System.out.println("Som de Ave");
	}
	
}
