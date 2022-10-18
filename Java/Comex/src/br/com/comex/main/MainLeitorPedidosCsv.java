package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;
import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.PedidoCsv;

public class MainLeitorPedidosCsv {
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidoCsv leitorPedidosCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidosCsv.lerPedidosCsv();
		System.out.println("Total de pedidos: " + pedidosCsv.size());
		
	}
}
