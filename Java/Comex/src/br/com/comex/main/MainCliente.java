package br.com.comex.main;
import br.com.comex.modelo.Cliente;
import br.com.comex.enums.estados;

public class MainCliente {

	public MainCliente(int ID, String Nome, long CPF, long Telefone, String Rua, String Numero, String Complemento,
			String Bairro, String Cidade, estados Estado) {
		super();

	}

	public static void main(String[] args) {	
		Object cliente4 = new Cliente("Luccas", "109212361728", "44984223978", "Rua Alagoas", "5540", "Casa Branca", "Zona 1",
				"Fernandópolis", estados.SP);
		System.out.println(cliente4.toString());
		System.out.println();
		Object cliente5 = new Cliente("Gabriel", "4589654896524", "14521256789", "Rua Caxias", "1231", "Casa Amarela", "Centro",
				"Rio de Janeiro", estados.RJ);
		System.out.println(cliente5.toString());
		System.out.println();
		Object cliente6 = new Cliente("Luanna", "417896325414", "456321789631", "Rua Maringa", "5540", "Casa Cinza", "Zona 7",
				"Londrina", estados.PR);
		System.out.println(cliente6.toString());
		System.out.println();
		Object cliente1 = new Cliente("Ana", "1234", "4321", "Rua Alagoas", "5540", "Casa Branca", "Zona 1",
				"Fernandópolis", estados.SP);
		System.out.println(cliente1.toString());

		Object cliente2 = new Cliente("Eli", "3213", "2313", "Rua São Paulo", "1520", "Sobreloja", "Zona 2", "Umuarama",
				estados.PR);
		System.out.println(cliente2.toString());

		Object cliente3 = new Cliente("Gabi", "2314", "4213", "Rua Rio de Janeiro", "1112", "Casa Laranja", "Zona 7",
				"Maringá", estados.PR);
		System.out.println(cliente3.toString());
	}
	

}
