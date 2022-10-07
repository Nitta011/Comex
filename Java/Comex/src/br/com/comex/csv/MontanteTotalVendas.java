package br.com.comex.csv;

import java.util.List;

public class MontanteTotalVendas {

	public double calcularTotalPreco(List<PedidosCsv> pedido) {

		double precoPedido = 0.0;

		for (PedidosCsv Pedidos : pedido) {
			double preco = Double.parseDouble(Pedidos.getPreco());
			double quantidade = Double.parseDouble(Pedidos.getQuantidade());
			precoPedido = precoPedido + (preco * quantidade);
		}
		return precoPedido;
	}
}