package lpa_Construtores;

public class Animal {

	private String cor;
	private double tamanho;

	//Construtor padrão
	public Animal() {
	}

	//Construtor de 1 assinatura
	public Animal(String cor) {
		this.cor = cor;

	}

	//Construtor 2 argumentos
	public Animal(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;





	}


}
