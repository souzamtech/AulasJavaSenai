package atividades.atividade2;
import java.util.Scanner;

public class Listaquestão1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Vamos falar sobre votação.");

        System.out.println("Digite qual sua idade:");

        int idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar.");
        }
        else if (idade >= 18 && idade <= 70){
            System.out.println("Pode votar e é obrigatório!");
        }
        else {
            System.out.println("Voto facultativo para você!");
        }

    }
}