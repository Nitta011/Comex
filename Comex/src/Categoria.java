
public class Categoria {

	private long ID;
	private String Nome;
	private StatusCategoria status = StatusCategoria.ATIVA;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		this.ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}
}