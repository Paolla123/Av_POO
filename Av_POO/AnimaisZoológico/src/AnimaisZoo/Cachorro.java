package AnimaisZoo;

//classe concreta C4

class Cachorro extends Mamifero implements ExibirDados{
	
	protected String Raca;
	
	public Cachorro(String nome, int idade, String tipoDePelo, String raca) {
        super(nome, idade, tipoDePelo);  
        this.Raca = raca;
    } 
	
	public void setRaca(String Raca) {
		this.Raca = Raca;
	}
	
	public String getRaca() {
		return this.Raca; 
	}
	
	// Implementação do método da interface ExibirDados
	@Override
	public void exibirInfo() {    
		System.out.println("Nome: " + this.Nome); 
		System.out.println("Idade: " + this.Idade + " Anos"); 
		System.out.println("Tipo de pena: " + this.Raca);     
	}
	
	//Implementação do metodo abstrato da classe mãe ANIMAL 
	@Override
	void emitirSom() {
		System.out.println(this.Nome + " está latindo: Au-Au-Au");
	}
	
	
}
