package Teste;

import br.com.comex.enums.StatusCategoria;

public class TesteMainProduto {

	public static void main(String[] args) {

		TesteCategoria categoria1 = new TesteCategoria("INFORMÁTICA");
//		categoria1.setID(1);
//		categoria1.setNome("INFORMÁTICA");
//		categoria1.setStatus(StatusCategoria.ATIVA);

		try {
		Object Produto1 = new TesteProduto("Notebook Samsung", " ", 3523.0, 1, categoria1);
		System.out.println(Produto1.toString());
		Object Produto0 = new TesteProdutoIsento("Smartphone Nokia 198", " ", 150.0, 3, categoria1);
		System.out.println(Produto0.toString());
		Object Produto5 = new TesteProduto("Smardas", null, 150.0, 32, categoria1);
		System.out.println(Produto5.toString());
		
		
	} catch (IllegalArgumentException msg) {
		System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
	}
}
}
