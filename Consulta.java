package lpa_Construtores;

public class Consulta {
	private String data;
	private String nomePasc;
	private String nomeDents;

	//Construtor padrão
	public Consulta() {
	}

	//Construtor de 1 assinatura
	public Consulta(String data) {
		this.data = data;

	}

	//Construtor 3 argumentos
	public Consulta(String data, String nomePasc , String nomeDents) {
		this.data = data;
		this.nomePasc = nomePasc;
		this.nomeDents = nomeDents;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getnomePasc() {
		return nomePasc;
	}

	public void setNomePasc(String nomePasc) {
		this.nomePasc = nomePasc;
	}
	public String getnomeDents() {
		return nomeDents;
	}

	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}






}
