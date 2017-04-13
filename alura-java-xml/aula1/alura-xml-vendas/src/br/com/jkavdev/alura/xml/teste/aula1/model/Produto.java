package br.com.jkavdev.alura.xml.teste.aula1.model;

public class Produto {

	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return "[Produto: " + nome + ", " + preco + "]";
	}

}
