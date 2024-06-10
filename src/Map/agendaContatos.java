package Map;

import java.util.HashMap;
import java.util.Map;

public class agendaContatos {
	private Map<String , Integer> agendaContatoMap;
	
	public agendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContatos(String nome, int numero) {
		agendaContatoMap.put(nome, numero);
	}
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	
}
