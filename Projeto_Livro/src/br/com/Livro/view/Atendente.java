package br.com.Livro.view;

import java.util.Scanner;

import br.com.Livro.model.Livro;

public class Atendente {
	Scanner los;
	
	public Atendente() {
		los = new Scanner(System.in);
	}
	
	public int menuPrincipal() {
		System.out.println("+=======BIBLIOTECA=======+");
		System.out.println("| 1 - Cadastrar Livros   |");
		System.out.println("| 2 - Listar os Livros   |");
		System.out.println("| 3 - Remover Livros     |");
		System.out.println("| 4 - Buscar Livros      |");
		System.out.println("| 0 - Sair               |");
		System.out.println("+========================+");
		int opcao = los.nextInt();
		los.nextLine();
		return opcao;
	}
	
	public String tituloLivro(){
		System.out.print("Digite o titulo do Livro > ");
		return los.nextLine();
	}
	
	public String autorLivro() {
		System.out.print("Digite o autor do Livro > ");
		return los.nextLine();
	}
	
	public int num_paginasLivro() {
		System.out.print("Digite o numero de paginas do Livro > ");
		return los.nextInt();
	}
	
	public double precoLivro() {
		System.out.print("Digite o preco do Livro > ");
		return los.nextInt();
	}
	
	public void visualizar(Livro livro) {
		System.out.println("---");
		System.out.println("Titulo: "+ livro.getTitulo());
		System.out.println("Autor: "+ livro.getAutor());
		System.out.println("Numero de paginas: "+ livro.getNum_Pag());
		System.out.println("Preco do livro: "+ livro.getPreco());
	}
	
	public String removerLivro() {
		System.out.print("Digite o titulo do Livro que deseja remover: ");
		return los.nextLine();
	}
	
	public String buscarLivro() {
		System.out.print("Digite o titulo do Livro para buscar: ");
		return los.nextLine();
	}
	
	public void visualizarLivroRemovido(String titulo) {
		System.out.println("Livro com o titulo '"+ titulo + "' removido");
	}
	
	public void menssagemNaoEncontrada(String titulo) {
		System.out.println("Livro não encontrado");
	}
	
	public void finalizarLivro() {
		System.out.println("Sistema Encerrado!!!");
	}
	
	public void mensagemErroPrograma() {
		System.out.println("Erro! Digite um dos numeros abaixo  ⬇");
	}
}
