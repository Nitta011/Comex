package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.comex.enums.StatusCategoria;

@XmlRootElement
public class Categoria {
	private long ProximoID =1;
	private long ID;
	private String nome;
	private StatusCategoria status = StatusCategoria.ATIVA;
	
	public Categoria(Long ID) {
		this.ID = ID; 
	}
	
	public Categoria() {
		
	}

	
	public Categoria(String nome, StatusCategoria status) {
		this.nome = nome;
		this.status = status;
	}
	
	public Categoria(long ID, String nome, StatusCategoria status) {

			if (ID != ProximoID) {
				String msg = "ID inválido!  " + ID;
				throw new IllegalArgumentException(msg);
			}
			int QtdCaracteresNome = nome.length();
			if (QtdCaracteresNome < 4) {
				String msg = nome + " Nome inválido";
				throw new IllegalArgumentException(msg);
			}
			this.ID = ID;
			this.nome = nome;
			this.status = StatusCategoria.ATIVA;
			ProximoID++;
		}	
	
	public Categoria(String nome) {
		int QtdCaracteresNome = nome.length();
		if (QtdCaracteresNome < 4) {
			String msg = nome + " Nome inválido!  " ;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ProximoID;
		this.nome = nome;
		this.status = StatusCategoria.ATIVA;
		ProximoID++;
		
	}
		 
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Categoria [ID=" + ID + ", nome=" + nome + ", status=" + status + "]";
	}

	
}