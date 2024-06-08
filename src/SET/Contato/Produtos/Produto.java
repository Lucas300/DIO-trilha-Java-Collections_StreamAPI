package SET.Contato.Produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private long codigoProduto;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, long codigoProduto, double preco, int quantidade) {
		this.nome = nome;
		this.codigoProduto = codigoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigoProduto == other.codigoProduto;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}



