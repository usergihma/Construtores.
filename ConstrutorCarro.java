package lpa_Construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro porsche = new Carro();
		//Construtor padrão
		porsche.setPlaca("12A5");
		porsche.setNumChassi(1234);

		System.out.println(porsche.getPlaca());
		System.out.println(porsche.getNumChassi());
		
		//Construtor 1 assinatura
		
		Carro lamborghini = new Carro ("14ZX");

		System.out.println(lamborghini.getPlaca());

		//Construtor 2 assinaturas

		Carro ferrari = new Carro("12AG 5C09",1234);

		System.out.println(ferrari.getPlaca());
		System.out.println(ferrari.getNumChassi());
	}

}
