package Teste;

public class TesteProdutoIsento extends TesteProduto {

	public TesteProdutoIsento(int ID, String Nome, String Descricao, double PrecoUnitario, 
			int QuantidadeEstoque, TesteCategoria Categoria) {

		super(Nome, Descricao, PrecoUnitario, QuantidadeEstoque, Categoria);

	}

	public static double ImpostoIsento() {
		Imposto = 0.0;
		return Imposto;
	}

	public static double CalculaValorEstoqueIsento() {
		TotalEstoque = (TesteProdutoIsento.getPrecoUnitario() * TesteProdutoIsento.getQuantidadeEstoque());
		return TotalEstoque;
	}

}
