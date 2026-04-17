//Exercício 1 -

package curso_programacaoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int hora; // define a variável hora
		
		Scanner sc = new Scanner(System.in);
		hora = sc.nextInt();
		
		if(hora < 12) {	// verifica se é demanhã
			System.out.println("Bom dia");
		}
		else if(hora < 18) {	// verifica se é detarde
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite"); // verifica se é anoite
		}
			
		sc.close();
	}

}
