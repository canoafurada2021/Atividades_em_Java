package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

	/*
	 * 4. Crie um programa simples em Java que faça dez leituras de dados (tipo
	 * inteiro) usando Scanner e usando um for array. Exiba no console o conteúdo
	 * lido cada vez que uma leitura é feita. Não utilize vetor.
	 * 
	 */

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			Integer numero = Integer.valueOf(leitura.nextLine());

			System.out.println(numero);

		}

	}

}
