package br.com.comex.modelo;

import br.com.comex.enums.estados;

public class Cliente {
	private static long ProximoID =1;
	private long ID;
	private String Nome;
	private String CPF;
	private String Telefone;
	private String Rua;
	private String Numero;
	private String Complemento;
	private String Bairro;
	private String Cidade;
	private estados Estado;

	public Cliente(long ID, String Nome, String CPF, String Telefone, String Rua, String Numero, String Complemento, String Bairro,
			String Cidade, estados Estado) {
		
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}
		if(Nome.length() <= 5) {
			String msg = "Nome Inválido! " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if(CPF.length() <=11 && CPF.length() >=14) {
			String msg = "CPF Inválido! " + CPF;
			throw new IllegalArgumentException(msg);
		}
		if (Telefone.length()<=11 && Telefone.length() >=16) {
			String msg = "Telefone Inválido! " + Telefone;
			throw new IllegalArgumentException(msg);
		}
		if(Rua.length()<= 5) {
			String msg = "Nome da rua Inválido! " + Rua;
			throw new IllegalArgumentException(msg);
		}
		if(Numero.length() < 2) {
			String msg = "Número Inválido! " + Numero;
			throw new IllegalArgumentException(msg);
		}
		if (Bairro.length() < 2) {
			String msg = "Bairro Inválido! " + Bairro;
			throw new IllegalArgumentException(msg);
		}
		if (Cidade.length() < 2) {
			String msg = "Cidade Inválida! " + Cidade;
			throw new IllegalArgumentException(msg);
		}
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
		ProximoID++;
	}

	public Cliente(String Nome, String CPF, String Telefone, String Rua, String Numero, String Complemento, String Bairro,
	String Cidade, estados Estado) {
		if(Nome.length() <= 5) {
			String msg = "Nome Inválido! " + Nome;
			throw new IllegalArgumentException(msg);
		}
		if(CPF.length() <=11 && CPF.length() >=14) {
			String msg = "CPF Inválido! " + CPF;
			throw new IllegalArgumentException(msg);
		}
		if (Telefone.length()<=11 && Telefone.length() >=16) {
			String msg = "Telefone Inválido! " + Telefone;
			throw new IllegalArgumentException(msg);
		}
		if(Rua.length()<= 5) {
			String msg = "Nome da rua Inválido! " + Rua;
			throw new IllegalArgumentException(msg);
		}
		if(Numero.length() < 2) {
			String msg = "Número Inválido! " + Numero;
			throw new IllegalArgumentException(msg);
		}
		if (Bairro.length() < 2) {
			String msg = "Bairro Inválido! " + Bairro;
			throw new IllegalArgumentException(msg);
		}
		if (Cidade.length() < 2) {
			String msg = "Cidade Inválida! " + Cidade;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ProximoID;
		this.Nome = Nome;
		this.CPF = CPF;
		this.Telefone = Telefone;
		this.Rua = Rua;
		this.Numero = Numero;
		this.Complemento = Complemento;
		this.Bairro = Bairro;
		this.Cidade = Cidade;
		this.Estado = Estado;
		ProximoID++;
	}
	
	public long getID() {
		return ID;
	}

	public String getNome() {
		return Nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getTelefone() {
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

	public estados getEstado() {
		return Estado;
	}
}
