package atividades.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLifo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma tarefa: ");
            tarefas.add(entrada.nextLine());

            System.out.println("Deseja continuar? (digite 'fim' para parar)");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")) {
                break;
            }
        }

        System.out.println("Total de tarefas registradas: " + tarefas.size());

        //  LÓGICA do LIFO
        System.out.println("\n--- Executando em ordem LIFO (Pilha) ---");
        while (!tarefas.isEmpty()) {

            int ultimoIndice = tarefas.size() - 1;

            // Pega e remove sempre o item do topo (o último que entrou)
            System.out.println("Processando: " + tarefas.get(ultimoIndice));
            tarefas.remove(ultimoIndice);
        }

    }
}


