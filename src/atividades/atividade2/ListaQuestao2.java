package atividades.atividade2;

import java.util.Scanner;

public class ListaQuestao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3) /3;
        System.out.println(media);

        if (media < 5) {
            System.out.println("Reprovado");
        }
        if (media >= 5 && media < 6.9){
            System.out.println("Recuperação");
        }

        if (media = 7  && media < 10);{
            System.out.println("Aprovado, parabéns, Zé!");
        }
    }
}
