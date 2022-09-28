package Teste;

public class TesteProduto {
	private long ID;
	private String Nome;
	private static String Descricao;
	private static double PrecoUnitario;
	private static int QuantidadeEstoque;
	private static TesteCategoria Categoria;
	static double Imposto;
	static double TotalEstoque;

	public TesteProduto(String Nome, String Descricao, double PrecoUnitario, int QuantidadeEstoque,
			TesteCategoria Categoria) {
		if (ID <= 0) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		} else {
			this.ID = ID;
		}
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 6) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		} else {
			this.Nome = Nome;
		}
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

	public void setID(int newID) {
		this.ID = newID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String newNome) {
		this.Nome = newNome;
	}

	public static String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String newDescricao) {
		this.Descricao = newDescricao;
	}

	public static double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public void setPrecoUnitario(double newPrecoUnitario) {
		this.PrecoUnitario = newPrecoUnitario;
	}

	public static int getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}

	public void setQuantidadeEstoque(int newQuantidadeEstoque) {
		this.QuantidadeEstoque = newQuantidadeEstoque;
	}

	public TesteCategoria getCategoria() {
		return Categoria;
	}

	public void setCategoria(TesteCategoria newCategoria) {
		this.Categoria = newCategoria;
	}

}
