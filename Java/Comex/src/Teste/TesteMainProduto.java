package Teste;
import br.com.comex.modelo.StatusCategoria;

public class TesteMainProduto {
	

	public static void main(String[] args) {

		TesteCategoria categoria1 = new TesteCategoria(1, "LAAU", StatusCategoria.ATIVA);
//		categoria1.setID(1);
//		categoria1.setNome("INFORMÁTICA");
//		categoria1.setStatus(StatusCategoria.ATIVA);


		TesteProduto Produto1 = new TesteProduto("Notebook Samsung", " ", 3523.0, 1, categoria1);
		
		System.out.println("O produto: " + Produto1.getNome() + ", cuja categoria é: " + categoria1.getNome()
				+ ", utilizando o ID; " + Produto1.getID() + ", está custando R$: " + TesteProduto.getPrecoUnitario()
				+ ", temos " + TesteProduto.getQuantidadeEstoque() + " unidade(s) em estoque."
				+ " O valor total em estoque desse produto é: " + TesteProduto.CalculaValorEstoque()
				+ " e o valor do imposto sobre o produto é de: " + TesteProduto.CalculaImposto());

		System.out.println();


	}
}