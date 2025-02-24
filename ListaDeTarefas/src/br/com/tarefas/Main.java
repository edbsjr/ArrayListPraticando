package br.com.tarefas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

		int operador = 1;

		System.out.println("---Bem Vindo a sua lista de Tarefas---");
		
		
		while (operador != 0) {

			System.out.println("--------------------------------------");
			System.out.println("Escolha uma opção:");
			System.out.println("1-Adicionar Tarefa");
			System.out.println("2-Remover Tarefa");
			System.out.println("3-Lista Completa");
			System.out.println("4-Lista Completa(Ordem Alfabetica");
			System.out.println("5-Lista Completa(Ordem Cronologica de Execucao");
			System.out.println("0-SAIR");
			System.out.println("Digite agora:");
			operador = input.nextInt();

			switch (operador) {
			case 1:
				System.out.println("Digite o Titulo gostaria de adicionar:");
				input = new Scanner(System.in);
				String titulo = input.nextLine();
				System.out.println("Digite a descrição gostaria de adicionar:");
				String descricao = input.nextLine();
				System.out.println("Digite qual data sera realizada:(YYYYMMDD)");
				int data = input.nextInt();

				Tarefa tarefa = new Tarefa(titulo, descricao, data);
				boolean existe = false;
				
				for (int i = 0; i < listaDeTarefas.size(); i++) {

					if (titulo.equals(listaDeTarefas.get(i).getTitulo())) { // FUNCIONA QUANDO PROCURO TITULO // NAO
																			// FUNCIONOU COMPARANDO O OBJETO COMPLETO
						System.out.println("Já existe essa tarefa registrada.");
						existe = true;
					}
				}
				if (existe == false) {
					if (listaDeTarefas.add(tarefa))
						System.out.println("Tarefa adicionada com sucesso.");
					else
						System.out.println("Erro ao adicionar a Tarefa");
				}

				break;
			case 2:

				System.out.println("Voce quer remover pelo INDICE(1) ou pelo TITULO(2):");
				int remov = input.nextInt();

				if (remov == 2) {
					System.out.println("Digite qual titulo deseja remover:");
					input = new Scanner(System.in);
					titulo = input.nextLine();

					for (int i = 0; i < listaDeTarefas.size(); i++) {
						if (titulo.equalsIgnoreCase(listaDeTarefas.get(i).getTitulo())) {
							listaDeTarefas.remove(listaDeTarefas.get(i));
						}
					}

				} else if (remov == 1) {
					System.out.println("Digite o INDICE deseja remover:");
					int indice = input.nextInt();// PRECISA SER COMPLETADO A APRESENTACAO DA TABELA PARA MELHOR
													// VISUALIZACAO
					listaDeTarefas.remove(indice);
				}

				break;
			case 3:

				for (Tarefa t : listaDeTarefas) {
					System.out.println(t.getTitulo() + " - " + t.getDescricao() + " | Data: " + t.getData());
				}
				break;
			case 4:
				//listaDeTarefas.sort(Comparator.comparing(data)); // AINDA TENTANDO ENTENDER COMO ORDERNAR
				
				break;
			case 0:
				System.out.println("---------PROGRAMA FINALIZADO----------");
				break;
			default:
				System.out.println("Opção Invalida");
				
				titulo = "Primeira"; descricao="primeira"; data= 2025;
				Tarefa tarefa2 = new Tarefa(titulo, descricao, data);
				listaDeTarefas.add(tarefa2);
				titulo = "Segunda"; descricao="segunda"; data= 2024;
				Tarefa tarefa3 = new Tarefa(titulo, descricao, data);
				listaDeTarefas.add(tarefa3);
				titulo = "Terceira"; descricao="terceira"; data= 2023;
				Tarefa tarefa4 = new Tarefa(titulo, descricao, data);
				listaDeTarefas.add(tarefa4);
				titulo = "Quarta"; descricao="quarta"; data= 2022;
				Tarefa tarefa5 = new Tarefa(titulo, descricao, data);
				listaDeTarefas.add(tarefa5);
				break;
			}

		}

	}

}
