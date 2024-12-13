package AnimaisZoo;

//Classe concreta c2

class Mamifero extends Animal{
	 
	protected String tipoDePelo;
	
	public Mamifero(String nome, int idade, String tipoDePelo) {
	    super(nome, idade); 
	    this.tipoDePelo = tipoDePelo; 
	}
	   
	String getNome() {
		return "Nome: " + this.Nome;   
	}
	 
	String getIdade() {
		return "Idade: " + this.Idade;
	}  
	
	void emitirSom() {
		System.out.println("Som de mamifero");
	}
	
}
