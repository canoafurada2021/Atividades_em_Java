package ex8;

import java.util.Scanner;

public class ex8 {

	// 8. Crie um vetor de String com tamanho definido e limitado. Preencha este
	// vetor utilizando algum laço de repetição (for each, for ou while). Em
	// seguida, exiba no console os dados do
	// vetor (um a um) e o tamanho
	// dele. Além disso, exiba apenas o último elemento acessando-o diretamente.

	public static void main(String[] args) {

		String[] vetor = new String[5];

		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira algo:");
			vetor[i] = leitura.nextLine();
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
		System.out.println("Tamanho do vetor:" + vetor.length);
		System.out.println("ultimo elemento do vetor");
		System.out.println(vetor[vetor.length - 1]);

	}
}
