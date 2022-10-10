package ex2;

import java.util.Scanner;

public class Exercicio2 {
	/**
	 * 2. Faça um programa para ler o nome (tipo String) e idade (tipo Integer) de
	 * uma pessoa usando Scanner. Exiba no console o conteúdo lido. Lembre-se: você
	 * terá que fazer uma conversão de tipo (casting).
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite seu nome:");

		System.out.println("Digite sua idade:");

		String name = leitura.nextLine();

		Integer idade = Integer.valueOf(leitura.nextLine());

		System.out.println(idade);
		System.out.println(name);

	}

}
