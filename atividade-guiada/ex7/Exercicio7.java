package ex7;

public class Exercicio7 {

	/*
	 * 7. Crie um vetor de String de tamanho 10 (dez) com valores pré-definidos.
	 * Você não deve usar Scanner. Em seguida, exiba no console os dados do vetor
	 * (um a um) e o tamanho dele. Além disso, exiba apenas o último elemento
	 * acessando-o diretamente.
	 * 
	 */

	public static void main(String[] args) {

		String[] vetor = new String[10];

		vetor[0] = "Ana";
		vetor[1] = "João";
		vetor[2] = "Patricia";
		vetor[3] = "Maria Clara";
		vetor[4] = "Maiara";
		vetor[5] = "Emily";
		vetor[6] = "Emily Neves";
		vetor[7] = "Eduarda";
		vetor[8] = "Andri";
		vetor[9] = "Lucas";

		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);

		}
		System.out.println("Tamanho do vetor " + vetor.length);
		System.out.println("Ultimo elemento do vetor " + vetor[vetor.length - 1]);

	}

}
