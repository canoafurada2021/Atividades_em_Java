package ex3;

import java.util.Scanner;

public class Exercicio3 {

	/**
	 * 3. Faça um programa para ler uma variável (tipo inteiro) usando Scanner.
	 * Exiba no console se este inteiro é par ou não. Lembre-se: você terá que fazer
	 * uma conversão de tipo (casting).
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite um numero:");
		Integer numero = Integer.valueOf(leitura.nextLine());

		if (numero % 2 == 0) {
			System.out.println("O número digitado é par");

		} else {

			System.out.println("O numero digitado é impar");
		}

	}

}
