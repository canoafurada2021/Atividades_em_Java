package ex9;

public class Exercicio9 {

	/*
	 * 9. Escreva um método responsável por calcular o abastecimento de um veículo.
	 * O método deve retornar o valor total a ser pago a partir do precoLitro e
	 * quantidadeLitros. Utilize wrapper classes do Java para os tipos usados e
	 * valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos
	 * para precoLitro e quantidadeLitros. Você deve apenas fazer um método. A sua
	 * classe Java não pode ter o método main(), apenas este método
	 */

	public Double calculaAbastecimento(Double precoLitro, Double quantidadeLitros) {

		Double valorPago = 0.0;

		if (precoLitro == null) {
			System.out.println("Nenhum valor foi inserido!");
		}

		if (quantidadeLitros == null) {

			System.out.println("Nenhum valor foi inserido!");
		}

		return valorPago;

	}

}
