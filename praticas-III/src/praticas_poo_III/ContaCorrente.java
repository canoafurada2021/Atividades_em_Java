package praticas_poo_III;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public Double sacar(double valorSaque) {
//tirar dinheiro
		double retornoSaque = 0;
		if (valorSaque > saldo) {

			System.out.println("Saldo insuficiente!");

		} else {
			saldo = saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		return retornoSaque;
	}

	public void depositar(Double valorDeposito) {

		saldo = saldo + valorDeposito;
	}

	public void MostraDados() {
		System.out.println("---Dados----");
		System.out.println("Titular: " + nomeTitular);
		System.out.println("CPF: " + cpf);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("----------");
	}
}
