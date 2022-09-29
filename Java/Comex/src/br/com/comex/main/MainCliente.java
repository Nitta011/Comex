package br.com.comex.main;
import br.com.comex.modelo.Cliente;
import br.com.comex.enums.estados;

public class MainCliente {

	public MainCliente(int ID, String Nome, long CPF, long Telefone, String Rua, String Numero, String Complemento,
			String Bairro, String Cidade, estados Estado) {
		super();

	}

	public static void main(String[] args) {	
		Cliente cliente4 = new Cliente("Luccas", "109212361728", "44984223978", "Rua Alagoas", "5540", "Casa Branca", "Zona 1",
				"Fernandópolis", estados.SP);
		System.out.println("O(A) cliente " + cliente4.getNome() + ", portador do CPF: " + cliente4.getCPF() + ", reside em "
				+ cliente4.getCidade() + ". Seu ID é: " + cliente4.getID());
		System.out.println();
		Cliente cliente5 = new Cliente("Gabriel", "4589654896524", "14521256789", "Rua Caxias", "1231", "Casa Amarela", "Centro",
				"Rio de Janeiro", estados.RJ);
		System.out.println("O(A) cliente " + cliente5.getNome() + ", portador do CPF: " + cliente5.getCPF() + ", reside em "
				+ cliente5.getCidade() + ". Seu ID é: " + cliente5.getID());
		System.out.println();
		Cliente cliente6 = new Cliente("Luanna", "417896325414", "456321789631", "Rua Maringa", "5540", "Casa Cinza", "Zona 7",
				"Londrina", estados.PR);
		System.out.println("O(A) cliente " + cliente6.getNome() + ", portador do CPF: " + cliente6.getCPF() + ", reside em "
				+ cliente6.getCidade() + ". Seu ID é: " + cliente6.getID());
		System.out.println();
		Cliente cliente1 = new Cliente("Ana", "1234", "4321", "Rua Alagoas", "5540", "Casa Branca", "Zona 1",
				"Fernandópolis", estados.SP);
		System.out.println("O(A) cliente " + cliente1.getNome() + ", portador do CPF: " + cliente1.getCPF() + ", reside em "
				+ cliente1.getCidade() + ". Seu ID é: " + cliente1.getID());

		Cliente cliente2 = new Cliente("Eli", "3213", "2313", "Rua São Paulo", "1520", "Sobreloja", "Zona 2", "Umuarama",
				estados.PR);
		System.out.println("O(A) cliente " + cliente2.getNome() + ", portador do CPF: " + cliente2.getCPF() + ", reside em "
				+ cliente2.getCidade() + ". Seu ID é: " + cliente2.getID());

		Cliente cliente3 = new Cliente("Gabi", "2314", "4213", "Rua Rio de Janeiro", "1112", "Casa Laranja", "Zona 7",
				"Maringá", estados.PR);
		System.out.println("O(A) cliente " + cliente3.getNome() + ", portador do CPF: " + cliente3.getCPF() + ", reside em "
				+ cliente3.getCidade() + ". Seu ID é: " + cliente3.getID());
	}
	

}
