package AnimaisZoo;

//classe concreta C5

class Gato extends Mamifero {

	protected String tipoDeComportamento;  
	
	public Gato(String nome, int idade, String tipoDePelo, String tipoDeComportamento) {
        super(nome, idade, tipoDePelo); 
        this.tipoDeComportamento = tipoDeComportamento;
    }

	public void settipoDeComportamento(String tipoDeComportamento) {
		this.tipoDeComportamento = tipoDeComportamento; 
	}
	
	public String gettipoDeComportamento() {
		return tipoDeComportamento; 
	}
	
	@Override
	void emitirSom() {
		System.out.println("Miau-Miau-Miau");
	}
	
	
	 
}
