
public class Produto {
	private int ID;
	private String Nome;
	private String Descricao;
	private static double PrecoUnitario;
	private static int QuantidadeEstoque;
	private static Categoria Categoria;
	static double Imposto;
	static double TotalEstoque;


	public Produto(int iD, String nome, String descricao, double precoUnitario, int quantidadeEstoque, Categoria categoria) {
		super();
		ID = iD;
		Nome = nome;
		Descricao = descricao;
		PrecoUnitario = precoUnitario;
		QuantidadeEstoque = quantidadeEstoque;
		Categoria = categoria;

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

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public static double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public static void setPrecoUnitario(double precoUnitario) {
		PrecoUnitario = precoUnitario;
	}

	public static int getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}

	public static void setQuantidadeEstoque(int quantidadeEstoque) {
		QuantidadeEstoque = quantidadeEstoque;
	}

	public static Categoria getCategoria() {
		return Categoria;
	}

	public static void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
}
