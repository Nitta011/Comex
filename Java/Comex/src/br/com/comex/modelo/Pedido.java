package br.com.comex.modelo;

import java.util.Date;

import br.com.comex.exception.ComexException;
import br.com.comex.modelo.Cliente;

public class Pedido {
	private static long ProximoID = 1;
	private long ID;
	private String Data;
	private Cliente cliente;

	public Pedido(long ID, String Data, Cliente cliente) throws ComexException {
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			new ComexException(msg);
		}
		this.ID = ID;
		this.Data = Data;
		this.cliente = cliente;
		ProximoID++;
	}

	public Pedido(String Data, Cliente cliente) {
		this.ID = ProximoID;
		this.Data = Data;
		this.cliente = cliente;
		ProximoID++;
	}

	public long getID() {
		return ID;
	}

	public String getData() {
		return Data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "O(A) Cliente " + getCliente() + " realizou um pedido, cujo ID é " + getID() + ", na data: " + getData();
	}

}
