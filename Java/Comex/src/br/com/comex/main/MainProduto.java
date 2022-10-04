package br.com.comex.main;
import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainProduto {
	

	public static void main(String[] args) {
		try {
		Categoria categoria1 = new Categoria("INFORMÁTICA");		
		Categoria categoria2 = new Categoria("MÓVEIS");
		Categoria categoria3 = new Categoria("LIVROS");


		Object Produto1 = new Produto(1, "Notebook Samsung", " ", 3523.0, 20, categoria1);
		
		

		System.out.println(Produto1.toString());
		
		Object Produto2 = new ProdutoIsento(2, "Clean Architecture", " ", 102.9, 8, categoria2);
		
		System.out.println(Produto2.toString());
		

		Object Produto3 = new Produto(3, "Monitor Dell 27 ", " " , 1889.0, 100, categoria1);
		System.out.println(Produto3.toString());

		}catch (IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
		}
		
	}
	
}