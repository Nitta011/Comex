package br.com.comex.modelo;

import java.util.List;

import br.com.comex.csv.PedidoCsv;

public class MontanteTotalVendas {

	public double calcularTotalPreco(List<PedidoCsv> pedido) {

		double precoPedido = 0.0;

		for (PedidoCsv Pedidos : pedido) {
			double preco = Double.parseDouble(Pedidos.getPreco());
			double quantidade = Double.parseDouble(Pedidos.getQuantidade());
			precoPedido = precoPedido + (preco * quantidade);
		}
		return precoPedido;
	}
}