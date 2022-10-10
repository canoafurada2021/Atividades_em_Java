package praticas_poo_III;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		ContaCorrente usuario = new ContaCorrente();
		usuario.nomeTitular = "Patricia Cordeiro";
		usuario.cpf = 12927326959l;
		usuario.saldo = 10000.00;
		usuario.numeroConta = 110l;
		usuario.MostraDados();

		usuario.sacar(234.0);
		usuario.depositar(120.0);

		usuario.MostraDados();
	}

}
