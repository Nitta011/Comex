package br.com.comex.main;

import java.io.FileNotFoundException;

import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.TotalProdutosVendidos;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidosCsv;
import br.com.comex.modelo.TotalProdutosVendidos;

public class MainTotalProdutosVendidos {
	public static void main(String[] args)throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidosCsv> pedidosCsv = leitorPedidosCsv.lerPedidosCsv();
		
		TotalProdutosVendidos totalProdutos = new TotalProdutosVendidos();
		
		System.out.println(Pedido.QtdTotalPedidos);
	}
}
