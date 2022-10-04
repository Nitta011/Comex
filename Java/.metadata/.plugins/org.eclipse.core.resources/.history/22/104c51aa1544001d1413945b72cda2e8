package Teste;

import br.com.comex.enums.StatusCategoria;

public class TesteMainProduto {

	public static void main(String[] args) {

		TesteCategoria categoria1 = new TesteCategoria("INFORMÁTICA");
//		categoria1.setID(1);
//		categoria1.setNome("INFORMÁTICA");
//		categoria1.setStatus(StatusCategoria.ATIVA);

		try {
		TesteProduto Produto1 = new TesteProduto("Notebook Samsung", " ", 3523.0, 1, categoria1);
		TesteProdutoIsento Produto0 = new TesteProdutoIsento("Smartphone Nokia 198", " ", 150.0, 3, categoria1);
		
		System.out.println("O produto: " + Produto1.getNome() + ", cuja categoria é: " + categoria1.getNome()
				+ ", utilizando o ID; " + Produto1.getID() + ", está custando R$: " + TesteProduto.getPrecoUnitario()
				+ ", temos " + TesteProduto.getQuantidadeEstoque() + " unidade(s) em estoque."
				+ " O valor total em estoque desse produto é: " + TesteProduto.CalculaValorEstoque()
				+ " e o valor do imposto sobre o produto é de: " + TesteProduto.CalculaImposto());
		System.out.println();
		System.out.println();
		
		System.out.println("O produto: " + Produto0.getNome() + ", cuja categoria é: " + categoria1.getNome()
		+ ", utilizando o ID; " + Produto0.getID() + ", está custando R$: " + TesteProdutoIsento.getPrecoUnitario()
		+ ", temos " + TesteProdutoIsento.getQuantidadeEstoque() + " unidade(s) em estoque."
		+ " O valor total em estoque desse produto é: " + TesteProdutoIsento.CalculaValorEstoque()
		+ " e o valor do imposto sobre o produto é de: " + TesteProdutoIsento.CalculaImposto());
		
		
		
		TesteProduto Produto5 = new TesteProduto("Smar", null, 150.0, 0, categoria1);
		
	} catch (IllegalArgumentException msg) {
		System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
	}
}
}
