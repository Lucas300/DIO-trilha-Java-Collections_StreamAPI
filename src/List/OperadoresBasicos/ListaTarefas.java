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

		
	}
	
	
	
	
}
