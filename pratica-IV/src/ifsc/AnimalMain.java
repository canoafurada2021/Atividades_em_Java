package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		ArrayList<Gato> listgatito = new ArrayList<>();
		ArrayList<Cachorro> listChorrito = new ArrayList<>();

		Gato gatito = new Gato();
		Gato harry = new Gato();
		Gato bruno = new Gato();

		Cachorro chorrito = new Cachorro();

		Cachorro antonio = new Cachorro();

		Cachorro slinky = new Cachorro();

	
		listChorrito.add(chorrito); // adicionando um cachorro na lista
		listChorrito.add(slinky);
		listChorrito.add(antonio);

		chorrito.setCor("Amarelo");
		chorrito.setNumeroPatas(3);
		chorrito.setEcossistema("Meu cachorro mora na minha cama e eu embaixo dela");
		chorrito.setNome("Jorginho do pneu");
		chorrito.setRaca("chiuauaua");
		chorrito.setComprimento(87f);

		antonio.setCor("Marrom");
		antonio.setEcossistema("Na praia");
		antonio.setNome("Antonio");
		antonio.setRaca("Poodle");
		antonio.setComprimento(50f);
		antonio.setNumeroPatas(4);
		antonio.setEcossistema("Na praia");
		antonio.setNome("Antonio");
		antonio.setRaca("Poodle");
		antonio.setComprimento(50f);

		slinky.setCor("Loiro");
		slinky.setEcossistema("Na cidade grande");
		slinky.setRaca("Golden Retriever");
		slinky.setComprimento(100f);
		slinky.setNumeroPatas(4);
		slinky.setNome("Slinky");
		slinky.setComprimento(50f);

		///////

		listgatito.add(gatito); // adicionando um gato na lista
		listgatito.add(harry);
		listgatito.add(bruno);
		gatito.setCor("Cinza");
		gatito.setNumeroPatas(4);
		gatito.setEcossistema("Minha casa");
		gatito.setNome("Dumbledore");
		gatito.setRaca("Ragdoll");
		gatito.setComprimento(50f);

		harry.setCor("Laranja");
		harry.setEcossistema("Na associação de moradores");
		harry.setNome("Harry Potter");
		harry.setRaca("Mainer Coon");
		harry.setComprimento(107f);
		harry.setNumeroPatas(4);

		bruno.setCor("Branco");
		bruno.setRaca("Persa");
		bruno.setEcossistema("Nos EUA");
		bruno.setRaca("Himalaio");
		bruno.setComprimento(30f);
		bruno.setNumeroPatas(4);
		bruno.setNome("Bruno");

		for (Cachorro cachorro : listChorrito) {

			System.out.println("Falando do meu cachorro " + cachorro.getNome());

			System.out.println(cachorro.getNumeroPatas());

			System.out.println(cachorro.getEcossistema());

			System.out.println(cachorro.getCor());

			System.out.println(cachorro.getComprimento());

			System.out.println(cachorro.getRaca());

			System.out.println("-------------");

		}

		for (Gato gato : listgatito) {

			System.out.println("Falando do meu gatinho " + gato.getNome());

			System.out.println(gato.getNumeroPatas());

			System.out.println(gato.getEcossistema());

			System.out.println(gato.getCor());

			System.out.println(gato.getComprimento());

			System.out.println(gato.getRaca());

			System.out.println("-------------");

		}

	}

}
