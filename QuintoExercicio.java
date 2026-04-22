package exercicio5;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class QuintoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");		// solicita o código do produto.
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");	// solicita a quantidade.
		int quantidade = sc.nextInt();
		
		double total = 0;
		
		if(codigo == 1) {	// Função para selecionar o produto e calcular o valor final.
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else if (codigo == 5 ){
			total = quantidade * 1.5;
		}
		else {
			System.out.println("Produto não localizado.");
		}
		
		System.out.printf("Total: R$ %.2f%n", total);	//imprime o total para o usuário.
		
		sc.close();
		
	}

}
