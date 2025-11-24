package br.com.Livro;

import br.com.Livro.service.Estoque;
import br.com.Livro.view.Atendente;

public class Main {
	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenuEscolha = 1;
		
		do {
			opcaoMenuEscolha = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolha, atendente);
		}while(opcaoMenuEscolha != 0);
		
		
	}
}
