package exercicio4;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");	//solicita a hora inicial.
		int horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");	//solicita a hora final.
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if (horaInicial < horaFinal) {		//Função para calcular a duração do jogo.
			duracao = horaFinal - horaInicial;
		} 
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + "hora(s)");
		
		sc.close();
	}

}
