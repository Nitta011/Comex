package Teste;
import br.com.comex.enums.StatusCategoria;

public class TesteCategoria {
	private static long ProximoID =1;
	private long ID;
	private String Nome;
	private StatusCategoria status = StatusCategoria.ATIVA;
	
	public TesteCategoria(long ID, String Nome, StatusCategoria status) {
		if (ID != ProximoID) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		}
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 4) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ID;
		this.Nome = Nome;
		this.status = StatusCategoria.ATIVA;
		ProximoID++;
	}
	
	public TesteCategoria(String Nome) {
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 4) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		}
		this.ID = ProximoID;
		this.Nome = Nome;
		this.status = StatusCategoria.ATIVA;
		ProximoID++;
		
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

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria newstatus) {
		this.status = newstatus;
	}
}