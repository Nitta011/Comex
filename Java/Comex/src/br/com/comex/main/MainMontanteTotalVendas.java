package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.modelo.MontanteTotalVendas;

public class MainMontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidoCsv leitorPedidosCsv = new LeitorPedidoCsv();
		List<PedidoCsv> montanteTotalVendas = leitorPedidosCsv.lerPedidosCsv();

		MontanteTotalVendas montanteTotal = new MontanteTotalVendas();
		System.out.println("O total de vendas foi: " + montanteTotal.calcularTotalPreco(montanteTotalVendas));

	}

}
