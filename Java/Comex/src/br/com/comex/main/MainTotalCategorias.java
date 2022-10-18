package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;
import javax.management.ListenerNotFoundException;
import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.modelo.TotalCategorias;

public class MainTotalCategorias {
	public static void main(String[] args) throws FileNotFoundException{
		LeitorPedidoCsv leitorPedidosCsv = new LeitorPedidoCsv();
		List<PedidoCsv> categorias = leitorPedidosCsv.lerPedidosCsv();
		
		TotalCategorias totalCategorias = new TotalCategorias();
		System.out.println("O total de categorias diferentes são: " + totalCategorias.CalcularTotalCategorias(categorias));
	}
}
