package Teste;
import br.com.comex.modelo.StatusCategoria;

public class TesteCategoria {
	private static long ProximoID =0;
	private long ID = ProximoID++;
	private String Nome;
	private StatusCategoria status = StatusCategoria.ATIVA;
	
	public TesteCategoria(long ID,String Nome, StatusCategoria status) {
		if (ID <= 0) {
			String msg = "ID inválido!  " + ID;
			throw new IllegalArgumentException(msg);
		} else {
			this.ID = ID;
		}
		int QtdCaracteresNome = Nome.length();
		if (QtdCaracteresNome < 4) {
			String msg = "Nome inválido!  " + Nome;
			throw new IllegalArgumentException(msg);
		} else {
			this.Nome = Nome;
		}
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