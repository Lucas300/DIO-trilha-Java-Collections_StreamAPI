package List.OperadoresBasicos.Tarefas;

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
	    for (Tarefa t : tarefaList) {  // Corrigido para iterar sobre tarefaList
	        if (t.getDescricao().equalsIgnoreCase(descricao)) {
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
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		listaTarefas.adicionarTarefa("tarefa 1");
		listaTarefas.adicionarTarefa("tarefa 1");
		listaTarefas.adicionarTarefa("tarefa 2");
		listaTarefas.adicionarTarefa("tarefa 3");
		
		System.out.println("O NUMERO DE TAREFAS É "+ listaTarefas.obterNumeroTotalTarefas());		
		listaTarefas.obterDescricoesTarefas();
		
		System.out.println();
		
		listaTarefas.removeTarefa("tarefa 1");//removendo as tarefas 1
		System.out.println("O NUMERO DE TAREFAS É "+ listaTarefas.obterNumeroTotalTarefas());		
		listaTarefas.obterDescricoesTarefas();
	
	}
}
