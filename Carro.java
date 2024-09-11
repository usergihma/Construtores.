package lpa_Construtores;

public class Carro {
	private String placa;
	private int numChassi;

	//Construtor padrão
	public Carro() {
	}

	//Construtor de 1 assinatura
	public Carro(String placa) {
		this.placa = placa;

	}

	//Construtor 2 argumentos
	public Carro(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(int NumChassi) {
		this.numChassi = NumChassi;





	}
}