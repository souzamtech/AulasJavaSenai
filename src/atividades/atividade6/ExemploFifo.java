package atividades.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploFifo {
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

        // LÓGICA do  FIFO
        System.out.println("\n--- Executando em ordem FIFO (Fila) ---");
        while (!tarefas.isEmpty()) {
            // Pega e remove sempre o item da posição 0 (o primeiro que entrou)
            System.out.println("Processando: " + tarefas.get(0));
            tarefas.remove(0);
        }


    }
}
