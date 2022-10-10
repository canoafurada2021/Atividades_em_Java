package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	/*
	 * 8. Crie uma lista (ArrayList) de String. Preencha esta lista com 10 elementos
	 * utilizando o método nativo add() usando um for array. Em seguida, exiba no
	 * console os dados da lista (um a um) usando foreach, além de exibir também o
	 * tamanho da lista (método size()). Além disso, exiba apenas o último elemento
	 * acessando-o diretamente.
	 */

	public static void main(String[] args) {

		ArrayList<String> listaItens = new ArrayList<>();

		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Insira um item na sua lista: ");
			String item = leitura.nextLine();

			if (!item.isEmpty()) {
				listaItens.add(item);
			}
		}

		for (String coisasNaLista : listaItens) {

			System.out.println(coisasNaLista);
		}
		System.out.println("Tamanho da lista: " + listaItens.size());

		System.out.println("Ultimo item da lista: " + listaItens.get(listaItens.size() - 1));
	}
}
