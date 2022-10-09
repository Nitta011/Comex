package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.modelo.Pedido;

public class MainLeitorPedidos {
	public static void main(String[] args) throws FileNotFoundException {
		MainLeitorPedidos leitorPedidos = new MainLeitorPedidos();
		List<Pedido> Pedidos = leitorPedidos.lerPedidos();
		
}
	private List<Pedido> lerPedidos() {
		// TODO Auto-generated method stub
		return null;
	}
}

