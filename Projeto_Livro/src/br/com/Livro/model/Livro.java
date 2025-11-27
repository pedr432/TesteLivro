package br.com.Livro.model;

public class Livro {
	
private String titulo;
	private String autor;
	private int num_pag;
	private double preco;
	private static int historico;
	
		public Livro() {
			this.titulo = " ";
			this.autor = " ";
			this.num_pag = 0;
			this.preco = 0.0;
			Livro.historico++;
		}
		
		public Livro(String titulo, String autor, int num_pag, double preco) {
			this.titulo = titulo;
			this.autor = autor;
			this.num_pag = num_pag;
			this.preco = preco;
			Livro.historico = 1;
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
}
