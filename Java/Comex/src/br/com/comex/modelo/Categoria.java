package br.com.comex.modelo;

public class Categoria {
	private static long ProximoID =0;
	private long ID=ProximoID++;
	private String Nome;
	private StatusCategoria status = StatusCategoria.ATIVA;

	public Categoria() {
		try {
			
		} catch (IllegalArgumentException ex) {
			System.out.println("Erro " + ex);
		}
	}

	public long getID() {
		return ID;
	}

	public void setID(long ID) {
		if (ID <= 0) {
			System.out.println("ID inválido! ");
		} else {
			this.ID = ID;
		}
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome <= 2) {
			System.out.println("Nome inválido! ");
		} else {
			this.Nome = Nome;
		}
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}
}