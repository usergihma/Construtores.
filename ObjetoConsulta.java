package lpa_Construtores;

public class ObjetoConsulta {

	public static void main(String[] args) {
		//Construtor padrão
				Consulta a = new Consulta();
				
				a.setData("11/05");
				a.setNomeDents("gi");
				a.setNomePasc("giu");

				System.out.println(a.getData());
				System.out.println(a.getnomeDents());
				System.out.println(a.getnomePasc());


				//Construtor 1 assinatura

				Consulta b = new Consulta ("14/1");

				System.out.println(b.getData());

				//Construtor 2 assinaturas
		Consulta c = new Consulta("15/05/2025", "Giulia", "Giovanna");

		System.out.println(c.getData());
		System.out.println(c.getnomePasc());
		System.out.println(c.getnomeDents());
	}

}