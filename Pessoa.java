package lpa_Construtores;

	public class Pessoa {
	private String nome;
	private int idade;

	//Construtor padrão
	public Pessoa() {

	}
	//Construtor 2 argumentos
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;

	}//Construtor de 1 assinatura
	public Pessoa(String nome) {
		this.nome = nome;

	}

	//Construtor de 1 assinatura
	public Pessoa(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}
}