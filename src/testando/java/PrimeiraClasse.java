package testando.java;

import testando.java.model.Gato;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}
}

class Livro {
	public String nome;
	public String numPaginas;
}