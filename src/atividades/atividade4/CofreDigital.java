package atividades.atividade4;

import java.util.Scanner;

public class CofreDigital {
    public static void abrirCofre(int codigo) {
        Scanner entrada = new Scanner(System.in);
        int senhaCorreta = 9999;
        int tentativas = 5;

        while (tentativas > 0) {
            System.out.print("Digite o código do cofre: ");
            int codigoDigitado = entrada.nextInt();

            if (codigoDigitado == 9999) {
                System.out.println("Cofre Aberto!");
                break;
            } else {
                tentativas = tentativas - 1;

                // Verifica se ainda sobrou alguma tentativa para avisar, senão bloqueia
                if (tentativas > 0) {
                    System.out.println("Código Errado. Restam " + tentativas + "...");
                } else {
                    System.out.println("Cofre Bloqueado!");
                }
            }

            public static void main (String[]args){
                // O main agora fica super limpo, ele só "chama" a função do cofre
                abrirCofre();
            }
        }







