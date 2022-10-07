package br.com.comex.csv;

import java.util.Comparator;
import java.util.List;
import br.com.comex.csv.PedidosCsv;

public class PedidoMaisBaratoEMaisCaro implements Comparator<PedidosCsv> {

	public int compare(PedidosCsv p1, PedidosCsv p2) {
		
		
		double precoP1 = (Double.parseDouble(p1.getPreco()) * Double.parseDouble(p1.getQuantidade()));
		double precoP2 = (Double.parseDouble(p2.getPreco()) * Double.parseDouble(p2.getQuantidade()));

		
		if (precoP1 == precoP2) {
			return 0;
		} else if (precoP1 > precoP2) {
			return 1;
		} else {
			return -1;
		}
	}
}
