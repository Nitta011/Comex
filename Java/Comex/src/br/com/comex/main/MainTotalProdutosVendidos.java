package br.com.comex.main;

import java.io.FileNotFoundException;

import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.TotalProdutosVendidos;

import java.util.List;

import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.PedidoCsv;

public class MainTotalProdutosVendidos {
	public static void main(String[] args)throws FileNotFoundException {
		LeitorPedidoCsv leitorPedidosCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidosCsv.lerPedidosCsv();
		
		TotalProdutosVendidos totalProdutos = new TotalProdutosVendidos();
		System.out.println("O total de produtos solicitados é de: " + totalProdutos.calcularProdutosVendidos(pedidosCsv));
		
	}
}
