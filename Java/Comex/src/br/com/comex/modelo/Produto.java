package br.com.comex.modelo;

import br.com.comex.exception.ComexException;

public class Produto {
	private long ID;
	private String Nome;
	private String Descricao;
	private static double PrecoUnitario;
	private static int QuantidadeEstoque;
	private static Categoria Categoria;
	static double Imposto;
	static double TotalEstoque;

	
	public Produto(String nome, String descricao, double PrecoUnitario, int QuantidadeEstoque, Categoria categoria) {
		Nome = nome;
		Descricao = descricao;
		this.PrecoUnitario = PrecoUnitario;
		this.QuantidadeEstoque = QuantidadeEstoque;
		this.Categoria = categoria;
	}

	public Produto(long ID, String Nome, String Descricao, double PrecoUnitario, int QuantidadeEstoque,
			Categoria Categoria) {
		if (ID <0 ) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}
			
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 6) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if(PrecoUnitario <=0){
			String msg = "Valor inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if(QuantidadeEstoque <=0){
			String msg = "Estoque inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ID;
		this.Nome = Nome;
		this.Descricao = Descricao;
		this.PrecoUnitario = PrecoUnitario;
		this.QuantidadeEstoque = QuantidadeEstoque;
		this.Categoria = Categoria;
	}
	
	public static double CalculaValorEstoque() {
		TotalEstoque = (PrecoUnitario * QuantidadeEstoque);
		return TotalEstoque;
	}

	public static double CalculaImposto() {
		Imposto = (PrecoUnitario * 0.4);
		return Imposto;
	}

	public long getID() {
		return ID;
	}

	public void setID(long newID) {
		ID = newID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String newNome) {
		Nome = newNome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String newDescricao) {
		Descricao = newDescricao;
	}

	public static double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public static void setPrecoUnitario(double newPrecoUnitario) {
		PrecoUnitario = newPrecoUnitario;
	}

	public static int getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}

	public static void setQuantidadeEstoque(int newQuantidadeEstoque) {
		QuantidadeEstoque = newQuantidadeEstoque;
	}

	public static long getCategoria() {
		return Categoria.getID();
	}
	public void setCategoria(Categoria newCategoria) {
		Categoria = newCategoria;
	}
	
	public String toString() {
		return "Produto: " + getNome() + ", está custando " + getPrecoUnitario() + ", temos " + getQuantidadeEstoque()
				+ " unidade(s) em estoque" + " e o imposto sobre o produto é de " + CalculaImposto();
	}
}
