package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
	
	public ProdutoIsento(int ID, String Nome, String Descricao, double PrecoUnitario, int QuantidadeEstoque,
			Categoria Categoria) {
		super(ID, Nome, Descricao, PrecoUnitario, QuantidadeEstoque, Categoria);
		
	}

	public static double ImpostoIsento() {
		Imposto = 0.0;
		return Imposto;
	}

	public static double CalculaValorEstoqueIsento() {
		TotalEstoque = (ProdutoIsento.getPrecoUnitario() * ProdutoIsento.getQuantidadeEstoque());
		return TotalEstoque;
	}

}
