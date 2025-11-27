package br.com.Livro.model;

public class Livro extends Produto {
	
	
	private static int historico;
	
		public Livro() {
			super();
			Livro.historico++;
		}
		
		public Livro(String titulo, String autor, int num_pag, double preco) {
			super(titulo, autor, num_pag, preco);
			Livro.historico = 1;
		}
}
