package ex10;

import java.util.Scanner;

public class Exercicio10 {

	/*
	 * 10. Considere um programa a ser feito no console do Eclipse IDE que deve
	 * calcular a média final (MF) de apenas um(a) discente. Considere um cálculo
	 * aritmético comum com três notas. Utilize tipos primitivos (pense qual tipo
	 * mais adequado para notas). Ao final, o programa deve informar:
	 * 
	 * Se MF >= 6: Aprovado(a) ● Se MF >= 4 e < 6: Recuperação ● Se MF <
	 * 4:Reprovado(a)
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		Double notaUm = Double.valueOf(leitura.nextLine());
		System.out.println("Digite a segunda nota: ");
		Double notaDois = Double.valueOf(leitura.nextLine());
		System.out.println("Digite a terceira nota: ");
		Double notaTres = Double.valueOf(leitura.nextLine());

		mediaFinal(notaUm, notaDois, notaTres);
	}

	public static Double mediaFinal(Double nota1, Double nota2, Double nota3) {
		Double mediaTotal = 0.0;

		mediaTotal = (nota1 + nota2 + nota3) / 3;

		if (mediaTotal >= 6.0) {
			System.out.println("Aluno aprovado! Sua nota: " + mediaTotal);

		} else if (mediaTotal <= 4 && mediaTotal < 6) {
			System.out.println("Aluno em recuperação..." + mediaTotal);

		} else if (mediaTotal <= 4) {
			System.out.println("Aluno reprovado..." + mediaTotal);
		}

		return mediaTotal;
	}

}
