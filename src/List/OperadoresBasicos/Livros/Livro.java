package List.OperadoresBasicos.Livros;

public class Livro {
	private String titulo;
	private String autor;
	private int ano_publicacao;
	
	public Livro(String titulo, String autor, int ano_publicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	@Override
	public String toString() {
		return String.format("[%s %s %d]", getTitulo(),getAutor(),getAno_publicacao());
	}
	
	
}
