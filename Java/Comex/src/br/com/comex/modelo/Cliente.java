package br.com.comex.modelo;

public class Cliente {
	private int ID;
	private String Nome;
	private int CPF;
	private int Telefone;
	private String Rua;
	private String Numero;
	private String Complemento;
	private String Bairro;
	private String Cidade;
	private String Estado;

	public Cliente(int ID, String Nome, int CPF, int Telefone, String Rua, String Numero, String Complemento, String Bairro,
			String Cidade, String Estado) {
		this.ID = ID;
		this.Nome = Nome;
		this.CPF = CPF;
		this.Telefone = Telefone;
		this.Rua = Rua;
		this.Numero = Numero;
		this.Complemento = Complemento;
		this.Bairro = Bairro;
		this.Cidade = Cidade;
		this.Estado = Estado;
	}
	
	public int getID() {
		return ID;
	}

	public String getNome() {
		return Nome;
	}

	public int getCPF() {
		return CPF;
	}

	public int getTelefone() {
		return Telefone;
	}

	public String getRua() {
		return Rua;
	}

	public String getNumero() {
		return Numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public String getEstado() {
		return Estado;
	}
}
