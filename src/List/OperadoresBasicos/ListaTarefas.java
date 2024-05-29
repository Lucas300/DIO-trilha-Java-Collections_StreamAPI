package List.OperadoresBasicos;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	//atributos
	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removeTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaParaRemover) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	
	
	
}
