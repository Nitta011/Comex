package Teste;

import br.com.comex.modelo.StatusCategoria;

public class TesteMainCategoria {


	public static void main(String[] args) {

//		TesteCategoria categoria0 = new TesteCategoria();
//		categoria0.setID(0);
//		categoria0.setNome("LAU");
//		categoria0.setStatus(StatusCategoria.ATIVA);
//		System.out.println("Categoria " + categoria0.getNome() + " ( " + categoria0.getID() + " - "
//				+ categoria0.getStatus() + ")");
		TesteCategoria categoria0 = new TesteCategoria(1, "LAAU", StatusCategoria.ATIVA);
		System.out.println("Categoria " + categoria0.getNome() + " ( " + categoria0.getID() + " - "
				+ categoria0.getStatus() + ")");
	}


}
