package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TotalProdutosVendidos {

	public double calcularProdutosVendidos(List<PedidosCsv> pedido) {
		int QtdTotalProdutos = 0;
		for (PedidosCsv Pedidos : pedido) {
			QtdTotalProdutos = QtdTotalProdutos + Integer.parseInt(Pedidos.getQuantidade());
		}

		return QtdTotalProdutos;
	}

}
