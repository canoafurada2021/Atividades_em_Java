package ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex12 {
	// 12. Crie uma lista de dez nomes (alfanuméricos) usando uma wrapper class.
	// Atualize um dos nomes da lista.

	public static void main(String[] args) {

		// criando lista
		List<String> lista = new ArrayList<>();

		ArrayList<String> listNames = new ArrayList<>();

		listNames.add("julia"); // inserir
		listNames.add("lucas"); // inserir
		listNames.add("josé"); // inserir
		listNames.add("bruno"); // inserir
		listNames.add("ricardão"); // inserir
		listNames.add("ricardão"); // inserir
		listNames.add("antonio"); // inserir
		listNames.add("maria Eduarda"); // inserir
		listNames.add("Joao lucas"); // inserir
		listNames.add("Pedro Antonio"); // inserir

		listNames.set(0, "julia ta diferente"); // atualizar

		Scanner leitura = new Scanner(System.in);

		for (String elemento : listNames) {
			System.out.println(elemento);
		}

	}
}
