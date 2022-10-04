package Teste;

public class TesteProduto {
	protected long ProximoID = 1;
	private long ID;
	private String Nome;
	private static String Descricao;
	private static double PrecoUnitario;
	private static int QuantidadeEstoque;
	private static TesteCategoria Categoria;
	static double Imposto;
	static double TotalEstoque;

	public TesteProduto(int ID, String Nome, String Descricao, double PrecoUnitario, int QuantidadeEstoque,
			TesteCategoria Categoria) {
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}

		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 6) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if (PrecoUnitario <= 0) {
			String msg = "Valor inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if (QuantidadeEstoque <= 0) {
			String msg = "Estoque inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ProximoID;
		this.Nome = Nome;
		this.Descricao = Descricao;
		this.PrecoUnitario = PrecoUnitario;
		this.QuantidadeEstoque = QuantidadeEstoque;
		this.Categoria = Categoria;
		this.TotalEstoque = TotalEstoque;
		ProximoID++;
	}

	public TesteProduto(String Nome, String Descricao, double PrecoUnitario, int QuantidadeEstoque,
			TesteCategoria Categoria) {

		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 6) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ProximoID;
		this.Nome = Nome;
		this.Descricao = Descricao;
		this.PrecoUnitario = PrecoUnitario;
		this.QuantidadeEstoque = QuantidadeEstoque;
		this.Categoria = Categoria;
		this.TotalEstoque = TotalEstoque;
		ProximoID++;
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

	public String getNome() {
		return Nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public static double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public static int getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}

	public TesteCategoria getCategoria() {
		return Categoria;
	}

	@Override
	public String toString() {
		return "Produto: " + getNome() + ", está custando " + getPrecoUnitario() + ", e temos " + getQuantidadeEstoque()
				+ " unidade(s) em estoque";
	}

}
