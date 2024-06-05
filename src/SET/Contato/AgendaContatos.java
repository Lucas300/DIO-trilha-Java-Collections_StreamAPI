package SET.Contato;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarNovoContato(String nome,int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> ContatoPorNome = new HashSet<>();
		for (Contato c : ContatoPorNome) {
			if (c.getNome().startsWith(nome)) {
				contatoSet.add(c);				
			}
		}
		return contatoSet;
	}
	
	public Contato AtualizarNumeroContato(String nome,int numeroNovo) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numeroNovo);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	
}
