package br.com.Livro.model;

public class Produto {
	
	protected String titulo;
	protected String autor;
	protected int num_pag;
	protected double preco;

	
	public Produto() {
		this.titulo = " ";
		this.autor = " ";
		this.num_pag = 0;
		this.preco = 0.0;
	}
	
	public Produto(String titulo, String autor, int num_pag, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.num_pag = num_pag;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNum_Pag() {
		return num_pag;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}

	

