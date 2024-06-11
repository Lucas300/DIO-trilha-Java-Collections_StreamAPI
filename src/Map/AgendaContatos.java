package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String , Integer> agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContatos(String nome, int numero) {
		agendaContatoMap.put(nome, numero);
	}
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
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
	public static void main(String[] args) {
AgendaContatos agendaContatos = new AgendaContatos();

		

		agendaContatos.adicionarContatos("camila", 123456);

		agendaContatos.adicionarContatos("Camila", 5665);

		agendaContatos.adicionarContatos("Camila Cavalcante", 11111);

		agendaContatos.adicionarContatos("Camila DIO", 654987);

		agendaContatos.adicionarContatos("Maria Silva", 11111);

		agendaContatos.adicionarContatos("Camila", 44444);

		

		agendaContatos.exibirContatos(); //lista 1

		

		agendaContatos.removerContato("Maria Silva");

		

		agendaContatos.exibirContatos(); //lista atualizada



		

		//agendaContatos.removerContato("maria");

		System.out.println("O numero é "+agendaContatos.pesquisarPorNome("Camila DIO"));
	}
	
}
