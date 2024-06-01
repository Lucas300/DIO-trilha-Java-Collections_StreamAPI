package List.OperadoresBasicos.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> listLivro;
	
	@SuppressWarnings("unused")
	private void construc() {
		this.listLivro = new ArrayList<>();
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livrosPorAutor.isEmpty()) {
			for (Livro livro : livrosPorAutor) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervalo(int anoInicial,int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		if(!livrosPorIntervalo.isEmpty()) {
			for (Livro livro : livrosPorIntervalo) {
				if(livro.getAno_publicacao()>=anoInicial && livro.getAno_publicacao()<=anoFinal) {
					livrosPorIntervalo.add(livro);
				}
			}
		}
		return livrosPorIntervalo;
	}
	
	@SuppressWarnings("unchecked")
	public List<Livro> pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if(!listLivro.isEmpty()){
			for (Livro livro : listLivro) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return (List<Livro>) livroPorTitulo;
	}
	
	
}
