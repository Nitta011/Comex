package br.com.comex.main;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;

public class MainCategoria {

	public static void main(String[] args) {
		try {
			Categoria categoria1 = new Categoria("INFORMÁTICA");
			System.out.println("Categoria " + categoria1.getNome() + " ( " + categoria1.getID() + " - "
					+ categoria1.getStatus() + ") ");

			Categoria categoria2 = new Categoria("MÓVEIS");
			System.out.println("Categoria " + categoria2.getNome() + " ( " + categoria2.getID() + " - "
					+ categoria2.getStatus() + ") ");

			Categoria categoria3 = new Categoria("LIVROS");
			System.out.println("Categoria " + categoria3.getNome() + " ( " + categoria3.getID() + " - "
					+ categoria3.getStatus() + ")");

			Categoria categoria0 = new Categoria("LA");
			System.out.println("Categoria " + categoria0.getNome() + " ( " + categoria0.getID() + " - "
					+ categoria0.getStatus() + ")");

		} catch (IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
		}

	}

}
