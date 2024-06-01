package List.OperadoresBasicos.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listLivro;
	
	
	
	public CatalogoLivros() {
		this.listLivro = new ArrayList<>();
	}

	//metodo para adicionar livros na lista
	public void adicionarLivros(String titulo, String autor, int ano_publicacao) {
		listLivro.add(new Livro(titulo, autor, ano_publicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!listLivro.isEmpty()) {
			for (Livro livro : listLivro) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervalo(int anoInicial,int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		if(!listLivro.isEmpty()) {
			for (Livro livro : listLivro) {
				if(livro.getAno_publicacao()>=anoInicial && livro.getAno_publicacao()<=anoFinal) {
					livrosPorIntervalo.add(livro);
				}
			}
		}
		return livrosPorIntervalo;
	}
	
	@SuppressWarnings("unchecked")
	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if(!listLivro.isEmpty()){
			for (Livro livro : listLivro) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return  livroPorTitulo;
	}
	

	public static void main(String[] args) {
		CatalogoLivros catalagolivros = new CatalogoLivros();
		catalagolivros.adicionarLivros("Livro 1", "Autor 1", 2020);
		catalagolivros.adicionarLivros("Livro 1", "Autor 2", 2021);
		catalagolivros.adicionarLivros("Livro 2", "Autor 2", 2022);
		catalagolivros.adicionarLivros("Livro 3", "Autor 3", 2023);
		catalagolivros.adicionarLivros("Livro 4", "Autor 4", 1994);
		
		System.out.println("Pesquisa por Titulo:");
		System.out.println(catalagolivros.pesquisarPorTitulo("livro 2"));
		System.out.println("Pesquisa por Autor:");
		System.out.println(catalagolivros.pesquisarPorAutor("Autor 2"));
		System.out.println("Pesquisa por Ano de lançamento:");
		System.out.println(catalagolivros.pesquisarPorIntervalo(2020, 2022));
	}
}
