package br.com.comex.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.comex.modelo.Cliente;

public class Pedido {
	private long ProximoID = 1;
	private long ID;
	private SimpleDateFormat Data;
	private Cliente cliente;
	public Pedido(int ID, SimpleDateFormat Data, Cliente cliente) {
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ID;
		this.Data = Data;
		this.cliente = cliente;
		ProximoID++;
	}
	
	public Pedido(SimpleDateFormat Data, Cliente cliente) {
		this.ID = ProximoID;
		this.Data = Data;
		this.cliente = cliente;
		ProximoID++;
	}
	
	
	public long getID() {
		return ID;
	}
	public SimpleDateFormat getData() {
		return Data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	
	
}


