package atividades.atividade5;

import java.util.Scanner;

public class AnalisadorTemperaturas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declara um vetor do tipo decimal chamado temperaturas de tamanho 6
        double[] temperaturas = new double[6];
        System.out.println("--- Analisador de Temperaturas ---");

        // Peça ao utilizador para digitar as 6 temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª temperatura: ");
            temperaturas[i] = entrada.nextDouble();
        }


        double maior = temperaturas[0];
        double menor = temperaturas[0];
//  Inicializa as variáveis com a primeira posição do vetor (conforme a dica)

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            // Percorre o vetor para encontrar o maior e o menor valor armazenados
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }


        System.out.println("\n--- Resultados ---");// Imprimir no console a lista formatada e os resultados


        System.out.print("Temperaturas: [");    // Montando a exibição do vetor no formato [x, y, z...]
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i]);
            if (i < temperaturas.length - 1) {
                System.out.print(", "); // Adiciona a vírgula para separar, exceto no último
            }
        }
        System.out.println("]");


        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Menor temperatura: " + menor + "°C");

    }
}