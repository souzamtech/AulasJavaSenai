package atividades.atividade2;

import java.util.Scanner;

public class ListaQuestao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu peso (ex: 70,5): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a sua altura (ex: 1,75): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal, perfeito");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso, cuidado!");
        } else if (imc >= 30.0) {
            System.out.println("Obesidade, procure se cuidar urgentemente");
        }
    }
}

