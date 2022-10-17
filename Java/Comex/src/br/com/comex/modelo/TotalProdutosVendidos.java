package br.com.comex.modelo;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.PedidoCsv;

public class TotalProdutosVendidos {

	public double calcularProdutosVendidos(List<PedidoCsv> pedido) {
		int QtdTotalProdutos = 0;
		for (PedidoCsv Pedidos : pedido) {
			QtdTotalProdutos = QtdTotalProdutos + Integer.parseInt(Pedidos.getQuantidade());
		}

		return QtdTotalProdutos;
	}

}
