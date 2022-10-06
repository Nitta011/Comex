package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;
import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidosCsv;

public class MainLeitorPedidosCsv {
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidosCsv> pedidosCsv = leitorPedidosCsv.lerPedidosCsv();
		System.out.println("Total de pedidos: " + pedidosCsv.size());
		
	}
}
