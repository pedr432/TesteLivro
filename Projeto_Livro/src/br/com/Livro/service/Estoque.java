package br.com.Livro.service;

import java.util.ArrayList;
import java.util.List;

import br.com.Livro.model.Livro;
import br.com.Livro.view.Atendente;

public class Estoque {
	List<Livro> listaLivros;
	
	public Estoque() {
		listaLivros = new ArrayList<>();
	}
	
	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch(opcao) {
			case 1 ->{
				String titulo = atendente.tituloLivro();
				String autor = atendente.autorLivro();
				int num_pag = atendente.num_paginasLivro();
				double preco = atendente.precoLivro();
				
				Livro livro = new Livro(titulo, autor, num_pag, preco);
				listaLivros.add(livro);
			}
			
			case 2 ->{
				for(Livro livro : listaLivros) {
					atendente.visualizar(livro);
				}
			}
			
			case 3 ->{
				String titulo = atendente.removerLivro();
				boolean removido = false;
				
				for(int indicie = 0; indicie < listaLivros.size(); indicie++) {
					if(listaLivros.get(indicie).getTitulo().equalsIgnoreCase(titulo)) {
					listaLivros.remove(indicie);
					removido = true;
					break;
					}
				}
				
				if(removido) {
					atendente.visualizarLivroRemovido(titulo);
				}else {
					atendente.menssagemNaoEncontrada(titulo);
				}
				
			}
			
			case 4 ->{
				String titulo = atendente.buscarLivro();
				Livro Encontrado = null;
				
				for(Livro livro : listaLivros) {
					if(livro.getTitulo().equalsIgnoreCase(titulo)) {
						Encontrado = livro;
						break;
						
					}
				}
				
				if(Encontrado != null) {
					atendente.visualizar(Encontrado);
				}else {
					atendente.menssagemNaoEncontrada(titulo);
				}
			}
		}
	}
}
