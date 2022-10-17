package ifsc;

public class MainPessoa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		aluno.setNome("Patricia Cordeiro");
		aluno.setCpf("12312312300");
		aluno.setMatricula(201434);

		professor.setNome("Bruna");
		professor.setCpf("89111042");
		professor.setSiape(11111);

		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Numero da matrícula: " + aluno.getMatricula());
		System.out.println("----------");
		
		System.out.println("Nome do professo: " + professor.getNome());
		System.out.println("CPF: " + professor.getCpf());
		System.out.println("Numero siape: " + professor.getSiape());

	}

}
