package br.com.comex.main;

import br.com.comex.enums.TipoDesconto;
import br.com.comex.enums.estados;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainPedido {

	
	
	
	public static void main(String[] args) {

		try {
			Categoria categoria1 = new Categoria("INFORMÁTICA");
			Categoria categoria2 = new Categoria("MÓVEIS");
			Categoria categoria3 = new Categoria("LIVROS");

			ProdutoIsento Produto2 = new ProdutoIsento(2, "Clean Architecture", " ", 102.9, 8, categoria2);
			Produto Produto1 = new Produto(1, "Notebook Samsung", " ", 3523.0, 20, categoria1);
			Produto Produto3 = new Produto(3, "Monitor Dell 27 ", " ", 1889.0, 100, categoria1);

			Cliente cliente4 = new Cliente("Luccas", "109212361728", "44984223978", "Rua Alagoas", "5540",
					"Casa Branca", "Zona 1", "Fernandópolis", estados.SP);
			Cliente cliente5 = new Cliente("Gabriel", "4589654896524", "14521256789", "Rua Caxias", "1231",
					"Casa Amarela", "Centro", "Rio de Janeiro", estados.RJ);
			Cliente cliente6 = new Cliente("Luanna", "417896325414", "456321789631", "Rua Maringa", "5540",
					"Casa Cinza", "Zona 7", "Londrina", estados.PR);

			Object pedido1 = new Pedido("24/01/2022", cliente5);
			System.out.println(pedido1.toString());
			Object pedido2 = new Pedido("29/06/2022", cliente4);
			System.out.println(pedido2.toString());
			Object pedido3 = new Pedido("30/09/2022", cliente6);
			System.out.println(pedido3.toString());
			Object Itempedido1 = new ItemPedido(3523.0, 12, cliente4, Produto1, pedido1, TipoDesconto.QUANTIDADE);
			System.out.println(Itempedido1.toString());

		} catch (IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
		}

	}

}
