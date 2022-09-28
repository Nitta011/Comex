package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.StatusCategoria;

public class MainProduto {
	

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria();
		categoria1.setID(1);
		categoria1.setNome("INFORMÁTICA");
		categoria1.setStatus(StatusCategoria.ATIVA);

		Categoria categoria2 = new Categoria();
		categoria2.setID(2);
		categoria2.setNome("MÓVEIS");
		categoria2.setStatus(StatusCategoria.INATIVA);

		Categoria categoria3 = new Categoria();
		categoria3.setID(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus(StatusCategoria.ATIVA);

		Produto Produto1 = new Produto(1, "Notebook Samsung", " ", 3523.0, 1, categoria1);
		
		System.out.println("O produto: " + Produto1.getNome() + ", cuja categoria é: " + categoria1.getNome()
				+ ", utilizando o ID; " + Produto1.getID() + ", está custando R$: " + Produto1.getPrecoUnitario()
				+ ", temos " + Produto1.getQuantidadeEstoque() + " unidade(s) em estoque."
				+ " O valor total em estoque desse produto é: " + Produto1.CalculaValorEstoque()
				+ " e o valor do imposto sobre o produto é de: " + Produto1.CalculaImposto());

		System.out.println();

		ProdutoIsento Produto2 = new ProdutoIsento(2, "Clean Architecture", " ", 102.9, 2, categoria2);
		
		System.out.println("O produto: " + Produto2.getNome() + ", cuja categoria é: " + categoria2.getNome()
				+ ", utilizando o ID; " + Produto2.getID() + ", está custando R$: " + Produto2.getPrecoUnitario()
				+ ", temos " + Produto2.getQuantidadeEstoque() + " unidade(s) em estoque."
				+ " O valor total em estoque desse produto é: " + Produto2.CalculaValorEstoqueIsento()
				+ " e o valor do imposto sobre o produto é de: " + Produto2.ImpostoIsento());

		System.out.println();

		Produto Produto3 = new Produto(3, "Monitor Dell 27 ", " " , 1889.0, 3, categoria1);
		
		System.out.println("O produto: " + Produto3.getNome() + ", cuja categoria é: " + categoria1.getNome()
				+ ", utilizando o ID; " + Produto3.getID() + ", está custando R$: " + Produto3.getPrecoUnitario()
				+ ", temos " + Produto3.getQuantidadeEstoque() + " unidade(s) em estoque."
				+ " O valor total em estoque desse produto é: " + Produto3.CalculaValorEstoque()
				+ " e o valor do imposto sobre o produto é de: " + Produto3.CalculaImposto());

	}
}