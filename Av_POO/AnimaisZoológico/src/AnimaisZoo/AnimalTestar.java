package AnimaisZoo;

public class AnimalTestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal passaro = new Ave("pica-pau", 1, "remiges");
	 	Comportamento pass = new Ave("pica-pau", 1, "remiges");
		
		passaro.exibirInfo();
		pass.comer();
		pass.dormir();
	 	
	 	//Mamifero cachorro = new Cachorro("Tobe", 3, "macio", "Vira-Lata");
	 	
	 	//cachorro.exibirInfo();
	 	//cachorro.emitirSom();
		
	}

}
