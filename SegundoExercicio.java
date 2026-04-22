package exercicio2;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar se ele é par: "); //Solicita um número ao usuário.
		int numero = scanner.nextInt();
		
		if (numero %2 == 0){	//Verifica se ele é par.
			System.out.println("O número é par.");
		} else {	//Verifica se ele é ímpar.
			System.out.println("O número é ímpar.");
		}
		
		scanner.close();
			
	}

}
