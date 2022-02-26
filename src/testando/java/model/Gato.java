package testando.java.model;

public class Gato {

	private String nome;
	private String cor;
	private Interger idade;

	public Gato() {
	}

	public Gato(String nome, String cor, Interger idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Interger getIdade() {
		return idade;
	}

	public void setIdade(Interger idade) {
		this.idade = idade;
	}

	/*
	 * public Gato(String nome, String cor, Integer idade) { this.nome= nome;
	 * this.cor= cor; this.idade= idade; }
	 */

}
