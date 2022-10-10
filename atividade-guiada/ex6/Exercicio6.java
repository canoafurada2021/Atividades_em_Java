package ex6;

import java.util.Scanner;

class Exercicio6 {

	/*
	 * Crie um vetor de tipo int e tamanho 10 (dez). Preencha este vetor via console
	 * usando o Scanner em um laço de repetição (for array). Mostre o maior número e
	 * o menor número ao final. Não é necessário exibir todo o conteúdo do vetor,
	 * apenas o maior e menor número.
	 */

	public static void main(String[] args) {

		int[] vetor = new int[10];

		Scanner leitura = new Scanner(System.in);

		int maior = 0;
		int menor = 99999;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira um valor do tipo intero: ");

			vetor[i] = leitura.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior elemento do vetor " + maior);
		System.out.println("O menor elemento do vetor " + menor);
	}

}
