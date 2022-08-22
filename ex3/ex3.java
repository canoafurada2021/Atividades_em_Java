package ex3;

public class ex3 {

	// 3. Escreva um método responsável por calcular o abastecimento de um veículo.
	// O método deve retornar o
	// valor total a ser pago a partir do precoLitro e quantidadeLitros. Utilize
	// wrapper classes do Java para os
	// tipos usados e valide - utilizando controle de fluxo - caso valores nulos
	// sejam fornecidos para precoLitro e
	// quantidadeLitros.

	public static void main(String[] args) {

	}

	public Double calculaAbastecimento(Double quantidadeLitros, Double precoLitro) {
		if (quantidadeLitros == null) {
			System.out.println("o valor inserido está nulo :(");
		}
		if (precoLitro == null) {
			System.out.println("o valor inserido está nulo :(");
		}
		return qtdLitros * precoLitro;

	}
}
