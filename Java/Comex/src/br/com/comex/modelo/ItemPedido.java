package br.com.comex.modelo;

import br.com.comex.enums.TipoDesconto;

public class ItemPedido {
	private static long ProximoID = 1;
	private long ID;
	private double PrecoUnitario;
	private int Quantidade;
	private Pedido pedido;
	private double Desconto;
	private TipoDesconto tipoDesconto;
	private double PrecoSemDesconto;
	private double PrecoFinal;
	private double PrecoTotal;
	private Cliente cliente;
	private String Data;
	private Produto produto;

	public ItemPedido(long ID, double PrecoUnitario, int Quantidade, Cliente cliente, Produto produto, Pedido pedido,
			TipoDesconto desconto) {
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ID;
		this.PrecoUnitario = PrecoUnitario;
		this.Quantidade = Quantidade;
		this.pedido = pedido;
		this.Desconto = Desconto;
		this.cliente = cliente;
		this.produto = produto;
		ProximoID++;

	}

	public ItemPedido(double PrecoUnitario, int Quantidade, Cliente cliente, Produto produto, Object pedido,
			TipoDesconto desconto) {

		this.ID = ProximoID;
		this.PrecoUnitario = PrecoUnitario;
		this.Quantidade = Quantidade;
		this.Desconto = Desconto;
		this.cliente = cliente;
		this.produto = produto;
		ProximoID++;

	}

	public void PrecoSemDesconto() {
		PrecoSemDesconto = PrecoUnitario * Quantidade;
	}

	public double CalculaTotal() { // Calcula o valor do desconto//

		if (tipoDesconto == TipoDesconto.NENHUM) {
			PrecoFinal = PrecoSemDesconto;
		} else if (tipoDesconto != TipoDesconto.PROMOCAO) {
			PrecoFinal = 0.2 * PrecoUnitario * Quantidade;
		} else if (tipoDesconto != TipoDesconto.QUANTIDADE) {
			PrecoFinal = 0.1 * PrecoUnitario * Quantidade;
		}
		return PrecoFinal;
	}

	public double  PrecoTotal() { // Calcula o valor do produto com o desconto
		PrecoTotal = (Quantidade * PrecoUnitario) - PrecoFinal;
		return PrecoTotal;
	}
	
	public double getPrecoTotal() {
		return PrecoTotal;
	}

	public double getPrecoFinal() {
		return PrecoFinal;
	}

	public static long getProximoID() {
		return ProximoID;
	}

	public long getID() {
		return ID;
	}

	public double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public TipoDesconto getTipoDesconto() {
		return tipoDesconto;
	}

	public Produto getProduto() {
		return produto;
	}

	public String toString() {
		return "O(A) Cliente " + getCliente() + " realizou um pedido referente ao produto," + getProduto()
				+ " cujo ID do pedido é " + getID() + " O desconto Obtido foi de: " + CalculaTotal()
				+ ", sendo assim o preço final do produto é de: " + getPrecoTotal();
	}
}
