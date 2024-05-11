package competec.aula2_loops;

import java.util.Scanner;

		// leia o número inteiro enviado pelo usuário utilizando o scanner.

		// teste se o número é par. Dica: lembre-se do operador '%', que retorna o resto da divisão entre dois números.
		
		// imprima o resultado da operação (se o número digitado é par ou ímpar).
public class Desafio0 {
	public static void main(String[] args) {
		System.out.println("Insira um número: ");
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if(numero % 2 == 0){
		System.out.println("É par ");
		}
		else{
			System.out.println("É impar");
		}
	}
}
