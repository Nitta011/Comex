package br.com.comex.main;

import java.text.SimpleDateFormat;
import br.com.comex.enums.estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {

		try {
			Cliente cliente4 = new Cliente("Luccas", "109212361728", "44984223978", "Rua Alagoas", "5540",
					"Casa Branca", "Zona 1", "Fernandópolis", estados.SP);
			Cliente cliente5 = new Cliente("Gabriel", "4589654896524", "14521256789", "Rua Caxias", "1231",
					"Casa Amarela", "Centro", "Rio de Janeiro", estados.RJ);
			Cliente cliente6 = new Cliente("Luanna", "417896325414", "456321789631", "Rua Maringa", "5540",
					"Casa Cinza", "Zona 7", "Londrina", estados.PR);

			SimpleDateFormat Data1 = new SimpleDateFormat("dd/MM/yyyy");
			//Data1 = 24/02/2022;//
			Pedido pedido1 = new Pedido(1, Data1, cliente5);
			System.out.println("O(A) cliente " + cliente5.getNome() + " realizou um pedido, cujo ID é "
					+ pedido1.getID() + " na data: ");

		} catch (IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
		}

	}
}
