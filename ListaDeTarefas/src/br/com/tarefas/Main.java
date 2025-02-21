package br.com.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Tarefa listaDeTarefas = new Tarefa();

		int operador;
		int indice = 0;
		String tarefa;

		System.out.println("---Bem Vindo a sua lista de Tarefas---");
		System.out.println("--------------------------------------");
		System.out.println("Escolha uma opção:");
		System.out.println("1-Adicionar Tarefa");
		System.out.println("2-Remover Tarefa");
		System.out.println("3-Lista Completa(Ordem Cronologica)");
		System.out.println("4-Lista Completa(Ordem Alfabetica");
		System.out.println("5-SAIR");
		System.out.println("Digite agora:");
		operador = input.nextInt();

		while (operador != 5) {
			switch (operador) {
			case 1:
				System.out.println("Digite qual tarefa deseja adicionar:");
				input = new Scanner(System.in);
				tarefa = input.nextLine();
				listaDeTarefas.adicionar(tarefa); // FEITO: CONSULTA A LISTA E DEPOIS ADICIONAR A LISTA
				break;
			case 2:
				System.out.println("Voce quer remover pelo INDICE(1) ou pela DESCRIÇÃO(2):");
				input = new Scanner(System.in);
				int remov = input.nextInt();
				if (remov == 2) {
					System.out.println("Digite qual tarefa deseja remover:");
					input = new Scanner(System.in);
					tarefa = input.nextLine();
					listaDeTarefas.removerDescricao(tarefa);// FEITO: CHAMA PARA REMOVER POR DESCRIÇÃO
				} else if (remov == 1) {
					System.out.println("Digite o INDICE deseja remover:");
					input = new Scanner(System.in);
					indice = input.nextInt();
					listaDeTarefas.removerIndice(indice); // FEITO: CHAMA PARA REMOVER PELO INDICE

				}
				break;
			case 3:
				listaDeTarefas.imprimirCronos();
				break;
			case 4:
				//FALTA IMPLEMENTAR A ORDEM ALFABETICA
				break;
			case 5:
				System.out.println("---------PROGRAMA FINALIZADO----------");
			}
			if (operador == 5) {
				break;
			}

			System.out.println("--------------------------------------");
			System.out.println("Escolha uma opção:");
			System.out.println("1-Adicionar Tarefa");
			System.out.println("2-Remover Tarefa");
			System.out.println("3-Lista Completa(Ordem Cronologica)");
			System.out.println("4-Lista Completa(Ordem Alfabetica");
			System.out.println("5-SAIR");
			System.out.println("Digite agora:");
			input = new Scanner(System.in);
			operador = input.nextInt();
		}

	}

}
