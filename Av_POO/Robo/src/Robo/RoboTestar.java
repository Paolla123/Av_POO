package Robo;

import java.util.Scanner;

public class RoboTestar {
	
	 private static void mostrarSala(Robo robo) {
	        for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 40; j++) {
	                if (i == robo.getLinha() && j == robo.getColuna()) {
	                    System.out.print("R");
	                } else {
	                    System.out.print(".");
	                }
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        Robo robocop = new Robo(0, 0, 1);

	        while (true) {
	            mostrarSala(robocop);
	            robocop.mostrarPosicaoAtual();
	            System.out.println("---------------------------");
	            System.out.println("|   Escolha o movimento:  |");
	            System.out.println("---------------------------");
	            System.out.println("1 - Andar para Frente   ");
	            System.out.println("2 - Andar para Trás     ");
	            System.out.println("3 - Andar para Direita  ");
	            System.out.println("4 - Andar para Esquerda ");
	            System.out.println("0 - Sair                ");
	            int escolha = scanner.nextInt();

	            if (escolha == 0) {
	                System.out.println("Encerrando...");
	                break;
	            }

	            switch (escolha) {
	                case 1:
	                	robocop.andarFrente();
	                	
	                	break;
	                	
	                case 2:
	                	robocop.andarTras();
	                	
	                	break;
	                	
	                case 3:
	                	robocop.andarDireita();
	                	
	                	break;
	                case 4: 
	                	robocop.andarEsquerda();
	                	
	                	break;
	                	
	                default: System.out.println("Escolha inválida!");
	            }
	        }

	        scanner.close();
	}

}
