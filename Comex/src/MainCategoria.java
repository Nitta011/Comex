
public class MainCategoria extends Categoria{

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria();
		categoria1.setID(1);
		categoria1.setNome("INFORMÁTICA");
		categoria1.setStatus(StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria1.getNome() + " ( " + categoria1.getID() + " - "
				+ categoria1.getStatus() + ") ");

		Categoria categoria2 = new Categoria();
		categoria2.setID(2);
		categoria2.setNome("MÓVEIS");
		categoria2.setStatus(StatusCategoria.INATIVA);
		System.out.println("Categoria " + categoria2.getNome() + " ( " + categoria2.getID() + " - "
				+ categoria2.getStatus() + ") ");

		Categoria categoria3 = new Categoria();
		categoria3.setID(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus(StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria3.getNome() + " ( " + categoria3.getID() + " - "
				+ categoria3.getStatus() + ")");

	}

}
