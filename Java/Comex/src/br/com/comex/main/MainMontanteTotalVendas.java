package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;
import br.com.comex.csv.MontanteTotalVendas;
import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidosCsv;

public class MainMontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidosCsv> montanteTotalVendas = leitorPedidosCsv.lerPedidosCsv();

		MontanteTotalVendas montanteTotal = new MontanteTotalVendas();
		System.out.println("O total de vendas foi: " + montanteTotal.calcularTotalPreco(montanteTotalVendas));

	}

}
