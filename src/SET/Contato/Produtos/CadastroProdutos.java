package SET.Contato.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int qtd) {
        produtoSet.add(new Produto(nome, codigo, preco, qtd));
    }

    public Set<Produto> exibirProdutoPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> ProdutosPorPreco = new TreeSet<>(new Produto.CompararPorPreco());
        ProdutosPorPreco.addAll(produtoSet);
        return ProdutosPorPreco;
    }
    
    public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		cadastroProdutos.adicionarProduto("Produto 2", 8L, 15, 2);
		cadastroProdutos.adicionarProduto("Produto 7", 2L, 15, 5);
		cadastroProdutos.adicionarProduto("Produto 4", 5L, 15, 3);
		cadastroProdutos.adicionarProduto("Produto 3", 2L, 15, 2);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutoPorNome());
		
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
