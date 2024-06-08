package SET.Contato.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	public void adicionarProduto(String nome,long codigo,double preco,int qtd) {
		produtoSet.add(new Produto(nome, codigo, preco, qtd));
	}
	
	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> ProdutosPorNome = new TreeSet<>(produtoSet);
		return ProdutosPorNome;
	}
	
	
}
