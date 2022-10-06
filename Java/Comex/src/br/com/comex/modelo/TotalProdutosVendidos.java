package br.com.comex.modelo;

import java.io.FileNotFoundException;
import br.com.comex.csv.PedidosCsv;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidosCsv;

public class TotalProdutosVendidos {

	public double calcularProdutosVendidos(List<PedidosCsv> pedidos) {		
		int QtdTotalProdutos = 0;
		for (PedidosCsv Pedido : pedidos) {
			QtdTotalProdutos = QtdTotalProdutos + Integer.parseInt(Pedido.getPreco());
		}
		
		return QtdTotalProdutos;
	}
	
	
	
	
	
	
	
	
	
//	
//		int QtdProdutos = Pedidos.size();
//		int numeroConvertido = Integer.parseInt(quantidade);
//		int i;
//		
//		int QtdTotalProdutos = 0;
//		for (i = 0; i < 16; i++) {
//			QtdTotalProdutos += numeroConvertido;
//			i++;
//		}
//		System.out.print(numeroConvertido + " ");
//	}
}
