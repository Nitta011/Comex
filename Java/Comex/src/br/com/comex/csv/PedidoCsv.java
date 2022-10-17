package br.com.comex.csv;

public class PedidoCsv {

    private String categoria;
    private String produto;
    private String cliente;
    private String preco;
    private String quantidade;
    private String data;

    public PedidoCsv(String categoria, String produto, String preco, String quantidade, String data,String cliente) {
        this.categoria = categoria;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data; 
        this.cliente = cliente;
    }
    
    
	public String getCategoria() {
        return categoria;
    }

    public String getProduto() {
        return produto;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    @Override
    public String toString() {
		String ValorFormatado = String.format(" R$%s",preco);
        return "Pedido{" +
                "categoria='" + categoria + '\'' +
                ", produto='" + produto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", preco=" + ValorFormatado +
                ", quantidade=" + quantidade +
                ", data=" + data +
                '}';
    }
    
}
