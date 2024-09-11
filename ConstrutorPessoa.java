package lpa_Construtores;

public class ConstrutorPessoa {

	public static void main(String[] args) {

		Pessoa jogador1 = new Pessoa();


		//Construtor padrão
		jogador1.setIdade(18);
		jogador1.setNome("Gigi");

		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());

		//Construtor com 2 argumentos
		Pessoa jogador2 = new Pessoa ("Messi",36);

		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());

		//Construtor com 1 Argumento

		Pessoa jogador3 = new Pessoa ("Ana");

		System.out.println(jogador3.getNome());
		
		//Construtor com 1 Argumento
		
		Pessoa jogador4 = new Pessoa (4);

		System.out.println(jogador4.getIdade());
		




	}

}
