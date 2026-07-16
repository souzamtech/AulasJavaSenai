package atividades.atividade5;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //  Declara um vetor  numeros com tamanho 5
        int[] numeros = new int[5];

        System.out.println("--- Soma de Elementos num Vetor ---");

        // Utiliza um laço para ler 5 números  do tipo Scanner
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        //  somando todos os elementos
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("\n--- Resultados ---");


        System.out.print("Vetor preenchido: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Exibe o resultado da soma no console
        System.out.println("A soma de todos os elementos é: " + soma);

    }
}
