package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoMaisBaratoEMaisCaro;
import br.com.comex.csv.PedidosCsv;

public class MainPedidoMaisBaratoEMaisCaro {
	public static void main(String[] args) throws FileNotFoundException {

		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidosCsv> pedidosCsv = leitorPedidosCsv.lerPedidosCsv();

		PedidoMaisBaratoEMaisCaro precoPedido = new PedidoMaisBaratoEMaisCaro();
		pedidosCsv.sort(precoPedido);
		double precoMaior = Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getPreco());
		double quantidadeMaior = Double.parseDouble(pedidosCsv.get(pedidosCsv.size() - 1).getQuantidade());
		double precoTotalItemMaisCaro = precoMaior * quantidadeMaior;
		String ValorFormatadoMaior = String.format("R$%s", precoTotalItemMaisCaro);

		double precoMenor = Double.parseDouble(pedidosCsv.get(0).getPreco());
		double quantidadeMenor = Double.parseDouble(pedidosCsv.get(0).getQuantidade());
		double precoTotalPedidoMaisBarato = precoMenor * quantidadeMenor;
		String ValorFormatadoMenor = String.format("R$%s", precoTotalPedidoMaisBarato);

		System.out.println(
				"O pedido mais barato foi de: " + ValorFormatadoMenor + "(" + pedidosCsv.get(0).getProduto() + ")");
		System.out.println("O pedido mais caro foi de: " + ValorFormatadoMaior + "("
				+ pedidosCsv.get(pedidosCsv.size() - 1).getProduto() + ")");

	}

}
