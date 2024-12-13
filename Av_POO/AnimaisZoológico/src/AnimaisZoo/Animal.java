package AnimaisZoo;

//classe abstrata C1	

public abstract class Animal {
	
	protected String Nome;
	protected int Idade;  
	
	public Animal(String Nome, int Idade) {
		this.Nome = Nome;
		this.Idade = Idade; 
	}

	abstract void emitirSom();
		
	abstract String getNome();
	
	void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	abstract String getIdade(); 
	
	void setIdade(int Idade) {
		this.Idade = Idade;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + this.Nome); 
		System.out.println("Idade: " + this.Idade); 
	}
}
