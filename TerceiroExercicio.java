package exercicio3;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 
import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A para verificar se é múltiplo: ");	//Solicita ao usuário o valor de A.
		int A = sc.nextInt();
		System.out.println("Digite o valor de B para verificar se é múltiplo: ");	// Solicita ao usuário o valor de B.
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {		// Função para verificar se são multiplos.
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
		
	}

}
