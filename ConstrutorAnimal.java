package lpa_Construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		//Construtor padrão
		Animal gato = new Animal();
		
		gato.setTamanho(11);
		gato.setCor("preto");

		System.out.println(gato.getTamanho());
		System.out.println(gato.getCor());


		//Construtor 1 assinatura

		Animal peixe = new Animal ("azul");

		System.out.println(peixe.getCor());

		//Construtor 2 assinaturas
		Animal lobo = new Animal("Cinza", 50);

		System.out.println(lobo.getCor());
		System.out.println(lobo.getTamanho());



	}
}
