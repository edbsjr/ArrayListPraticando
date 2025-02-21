package br.com.tarefas;

import java.util.List;
import java.util.ArrayList;

public class Tarefa {

	private ArrayList<String> listaDeTarefas = new ArrayList<>();
	// private ArrayList<Integer> listaDeIndices = new ArrayList<>();
	private boolean confirmado = true;
	private String tarefa;
	private int indice;

	public void adicionar(String tarefa) {

		this.tarefa = tarefa;
		confirmado = true;// Checando se a propriedade esta conforme deve

		for (int i = 0; i < listaDeTarefas.size(); i++) { // CHECA TODAS AS LINHAS DA LISTA

			if (tarefa == listaDeTarefas.get(i)) {
				confirmado = false;
				System.out.println("Item ja adicionado.");
				break; // Ou Continue
			}

		}
		if (confirmado == true) {

			listaDeTarefas.addLast(tarefa); // ADICIONA NA ULTIMA POSIÇÃO GARANTINDO A CRONOLOGIA
			System.out.println("Item adicionado com Sucesso.");
		}
	}

	public void removerDescricao(String tarefa) {
		
		confirmado = false;
		
		for (int i = 0; i < listaDeTarefas.size(); i++) {

			if (tarefa == listaDeTarefas.get(i)) {
				confirmado = true;
				listaDeTarefas.remove(i);
				System.out.println("Item removido com sucesso.");
				break; // Ou Continue para interromper o FOR
			}
		}
		if(confirmado == false)
			System.out.println("Item não encontrado para remover.");

	}
	
	public void removerIndice(int indice) {
		this.indice = indice;
		confirmado = false;
		
		tarefa = listaDeTarefas.get(indice); // ESTA PROCURANDO PELA DESCRIÇÃO. DA PRA MELHORAR?
		confirmado = listaDeTarefas.contains(tarefa);
		if(confirmado == true) {
		listaDeTarefas.remove(indice);
		System.out.println("Indice removido com sucesso.");
		}
		else { System.out.println("Indice não encontrado para remoção.");
			
		}
	}
	
	public void imprimirCronos()
	{
		for (int i = 0; i < listaDeTarefas.size(); i++) {  //IMPRIME TODAS AS TAREFAS POR ORDEM DE ENTRADA

			System.out.println("Indice: "+i+" - "+listaDeTarefas.get(i));
			
			}

		}
	
}
