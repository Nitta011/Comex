package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {

	public int CalcularTotalCategorias(List<PedidosCsv> categoriasDiferentes) {
		List<String> categoriasQueJaApareceram = new ArrayList<>();

		for (PedidosCsv Pedidos : categoriasDiferentes) {
			String categoria = Pedidos.getCategoria();
			if (!categoriasQueJaApareceram.contains(categoria)) {
				categoriasQueJaApareceram.add(categoria);
			}
		}
		return categoriasQueJaApareceram.size();
	}
}
