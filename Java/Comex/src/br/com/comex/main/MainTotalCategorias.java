package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;
import javax.management.ListenerNotFoundException;
import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidosCsv;
import br.com.comex.csv.TotalCategorias;

public class MainTotalCategorias {
	public static void main(String[] args) throws FileNotFoundException{
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidosCsv> categorias = leitorPedidosCsv.lerPedidosCsv();
		
		TotalCategorias totalCategorias = new TotalCategorias();
		System.out.println("O total de categorias diferentes são: " + totalCategorias.CalcularTotalCategorias(categorias));
	}
}
