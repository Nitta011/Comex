package br.com.comex.main;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;

public class MainCategoria {

	public static void main(String[] args) {
		try {
			Object categoria1 = new Categoria("INFORMÁTICA");
			System.out.println(categoria1.toString());

			Object categoria2 = new Categoria("MÓVEIS");
			System.out.println(categoria2.toString());

			Object categoria3 = new Categoria("LIVROS");
			System.out.println(categoria3.toString());

			Object categoria0 = new Categoria("LA");
			System.out.println(categoria0.toString());

		} catch (IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado:" + msg.getMessage());
		}

	}

}
