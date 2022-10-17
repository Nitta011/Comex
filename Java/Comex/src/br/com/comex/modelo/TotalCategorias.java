package br.com.comex.modelo;

import java.util.ArrayList;
import java.util.List;
import br.com.comex.csv.PedidoCsv;

public class TotalCategorias {
	public int CalcularTotalCategorias(List<PedidoCsv> categoriasDiferentes) {
		List<String> categoriasQueJaApareceram = new ArrayList<>();
		for (PedidoCsv Pedidos : categoriasDiferentes) {
			String categoria = Pedidos.getCategoria();
			if (!categoriasQueJaApareceram.contains(categoria)) {
				categoriasQueJaApareceram.add(categoria);
			}
		}
		return categoriasQueJaApareceram.size();
	}
}