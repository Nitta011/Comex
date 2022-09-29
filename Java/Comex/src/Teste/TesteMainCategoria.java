package Teste;

import br.com.comex.enums.StatusCategoria;

public class TesteMainCategoria {

	public static void main(String[] args) {
		try {
			
			TesteCategoria categoria0 = new TesteCategoria(1, "LAAU", StatusCategoria.ATIVA);
			System.out.println("Categoria " + categoria0.getNome() + " ( " + categoria0.getID() + " - "
					+ categoria0.getStatus() + ")");
			System.out.println("-------------------------------------------");
			TesteCategoria categoria1 = new TesteCategoria("iririrri");
			System.out.println("Categoria " + categoria1.getNome() + " ( " + categoria1.getID() + " - "
					+ categoria1.getStatus() + ")");
		} catch (IllegalArgumentException ex) {
			System.out.println("O item a seguir foi inserido incorretamente: " + ex.getMessage());
		}
	}
}
