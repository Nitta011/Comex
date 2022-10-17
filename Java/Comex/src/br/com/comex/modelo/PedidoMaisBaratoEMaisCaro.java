package br.com.comex.modelo;

import java.util.Comparator;
import java.util.List;
import br.com.comex.csv.PedidoCsv;

public class PedidoMaisBaratoEMaisCaro implements Comparator<PedidoCsv> {

	public int compare(PedidoCsv p1, PedidoCsv p2) {
		
		
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
