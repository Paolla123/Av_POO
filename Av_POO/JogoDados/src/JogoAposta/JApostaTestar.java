package JogoAposta;

import java.util.Scanner;
import java.util.ArrayList;

public class JApostaTestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in); 
		ArrayList<JogoAposta> Jogadores = new ArrayList<JogoAposta>(); 
		
		JogoAposta j1 = new JogoAposta();
		JogoAposta j2 = new JogoAposta();
		JogoAposta j3 = new JogoAposta();
		JogoAposta j4 = new JogoAposta();
		
		Jogadores.add(j1);
		Jogadores.add(j2);
		Jogadores.add(j3);
		Jogadores.add(j4); 
		
		int opc = 0;
		do {
			System.out.println("Seja Bem-Vindo(A), Ao Jogos De Apostas[DADOS]");
			leitor.nextLine();
			
			System.out.println("----------------------------------");
			System.out.println("          REGRAS DO JOGO");
			System.out.println("----------------------------------");
			System.out.println("1 - O jogo é para exatamente 4 participantes.");
			System.out.println("2 - Nenhum participante pode escolher números iguais aos dos outros.");
			System.out.println("3 - Os dados são lançados e a soma deles é calculada.");
			System.out.println("4 - Os números que podem ser escolhidos vão de 2 a 12.");
			System.out.println("5 - Se nenhum participante vencer, os pontos vão para o sistema (máquina).");
			System.out.println("6 - A identidade de cada jogador deve permanecer a mesma em todas as partidas.");
			
			leitor.nextLine();
			
			j1.Raking();
			int index = 1;
			
			do {
				
				leitor.nextLine();
				System.out.println("____INICIANDO JOGO____");
				System.out.println( index+"ª" + " PARTIDA");
			
				for (int i = 0; i < Jogadores.size(); i++) { // Loop para 4 jogadores
					leitor.nextLine();
					System.out.println("JOGADOR " + (i + 1));
					System.out.println("---------------------");
                  
					System.out.println("Nome: ");
					Jogadores.get(i).setNome(leitor.nextLine()); 
                
					System.out.println("Número Escolhido: "); 
					Jogadores.get(i).setNumAposta(leitor.nextInt());
					leitor.nextLine(); // Limpa o buffer após o nextInt()
                
				}
			
				leitor.nextLine();
				System.out.println("DADOS SENDO LANÇADOS...");
				
				
				boolean aux = false;
				int numeroSortido = -1;
				for(int j = 0; j < Jogadores.size(); j++) {
					leitor.nextLine();
					Jogadores.get(j).NumeroSortido();
					
					if(Jogadores.get(j).validarVencedor()) {
						System.out.println("Parabéns " + Jogadores.get(j).getNome() + " Você Venceu!" );
						System.out.println("Número Sortido: " + Jogadores.get(j).getNumeroSortido() );
						aux = true;
					}
					
					numeroSortido = Jogadores.get(j).getNumeroSortido(); 
				}
				
				if(!aux) {
					System.out.println("Nenhum Jogador humano Venceu :( " );
					System.out.println("Número Sortido: " + numeroSortido); 
				}
				
				index += 1;
				
			}while(index <= 3);
			
			
			for(int i = 0; i<Jogadores.size(); i++) {
			
				if(Jogadores.get(i).getPontuação() > Jogadores.get(i).getPontuação()) {
					Jogadores.get(i).registrarVitorias();
				}else {
					Jogadores.get(i).setQuantVM(+1); 
				} 
			}
		
			for (JogoAposta jogador : Jogadores) { 	
					jogador.Raking();
			}
			leitor.nextLine();
		
			System.out.println("Desejam Jogar Novamente? (1-Sim, 2-Não)");
			opc = leitor.nextInt();
			 
			
		}while(opc != 2);
	}
}
