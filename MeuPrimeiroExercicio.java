//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package exercicio1;

import java.util.Scanner;

public class MeuPrimeiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Lê um número inteiro
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		// Verifica se é negativo
		if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número não é negativo.");			
		}
		
		scanner.close();
	}

}
