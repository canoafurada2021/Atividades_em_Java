package ex1;

import java.util.Scanner;

public class Exercicio1 {

	/*
	 * 1. Crie um programa que permite ler uma variável (tipo String) usando
	 * Scanner. Exiba no console o conteúdo da variável.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite algo:");

		String variavel = leitura.nextLine();

		System.out.println(variavel);

	}

}
