package atividades.atividade1;

import java.util.Scanner;

public class FormularioSENAI {

    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);

       System.out.println("Qual seu nome?");
       String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura? (ex: 1.75)");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu cargo?");
        String cargo = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Quanto tempo você está no SENAI?");
         String periodo = entrada.nextLine();


        // resultados
        System.out.println("Nome completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Cargo: " + cargo);
        System.out.println("Período no SENAI: " + periodo);


    }
}



