package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

	// 9. Crie uma lista de String usando a estrutura de dados ArrayList. Preencha
	// esta lista com a mesma
	// quantidade de elementos utilizados no Exercício 08. Em seguida, exiba no
	// console: os dados da lista (um a
	// um), o tamanho da lista e verifique se está vazia. Além disso, exiba apenas o
	// último elemento acessando-o
	// diretamente.

	public static void main(String[] args) {

		// criando lista
		List<String> lista = new ArrayList<>();

		ArrayList<String> listaCoisas = new ArrayList<>();

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira algum item a sua lista!: ");
			String itens = leitura.nextLine();

			if (itens.isEmpty()) {
				System.out.println("Sua lista esta vazia :(");
			}

			if (!itens.isEmpty()) {
				listaCoisas.add(itens);

			}

		}

		System.out.println("Tamanho da sua lista:" + listaCoisas.size());
		// System.out.println("Ultimo elemento da lista: "+ listaCoisas.lastIndexOf("",
		// 5));

		for (String elemento : listaCoisas) {
			System.out.println(elemento);
		}

	}

}
