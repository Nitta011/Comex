package br.com.comex.main;
import br.com.comex.modelo.Cliente;

public class MainCliente extends Cliente {

	public MainCliente(int ID, String Nome, int CPF, int Telefone, String Rua, String Numero, String Complemento,
			String Bairro, String Cidade, String Estado) {
		super(ID, Nome, CPF, Telefone, Rua, Numero, Complemento, Bairro, Cidade, Estado);

	}

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Ana", 1234, 4321, "Rua Alagoas", "5540", "Casa Branca", "Zona 1",
				"Fernandópolis", "São Paulo");
		System.out.println("O(A) cliente " + cliente1.getNome() + ", portador do CPF: " + cliente1.getCPF() + ", reside em "
				+ cliente1.getCidade() + ". Seu ID é: " + cliente1.getID());

		Cliente cliente2 = new Cliente(2, "Eli", 3213, 2313, "Rua São Paulo", "1520", "Sobreloja", "Zona 2", "Umuarama",
				"Paraná");
		System.out.println("O(A) cliente " + cliente2.getNome() + ", portador do CPF: " + cliente2.getCPF() + ", reside em "
				+ cliente2.getCidade() + ". Seu ID é: " + cliente2.getID());

		Cliente cliente3 = new Cliente(3, "Gabi", 2314, 4213, "Rua Rio de Janeiro", "1112", "Casa Laranja", "Zona 7",
				"Maringá", "Paraná");
		System.out.println("O(A) cliente " + cliente3.getNome() + ", portador do CPF: " + cliente3.getCPF() + ", reside em "
				+ cliente3.getCidade() + ". Seu ID é: " + cliente3.getID());
	}

}
