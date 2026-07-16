package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemploFefo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();


        while (true) {
            System.out.print("Digite o nome do produto/tarefa: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a validade (Formato AAAA-MM-DD): ");
            String data = entrada.nextLine();


            tarefas.add(data + " | " + nome);

            System.out.println("Deseja continuar? (digite 'fim' para parar)");
            String opcao = entrada.nextLine();

            if (opcao.equals("fim")) {
                break;
            }
        }

        System.out.println("Total de itens registrados: " + tarefas.size());

        // --- LÓGICA FEFO ---
        // Organiza a lista. Como a data está no padrão Ano-Mes-Dia no início do texto
        // ele vai colocar as datas mais antigas (vencimentos mais próximos) no começo
        Collections.sort(tarefas);

        System.out.println("\n--- Executando em ordem FEFO (Validade) ---");
        while (!tarefas.isEmpty()) {
            // Remove o item da posição 0 (que agora é o item que vence primeiro graças à ordenação)
            System.out.println("Processando: " + tarefas.get(0));
            tarefas.remove(0);
        }

    }
}
