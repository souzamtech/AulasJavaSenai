package atividades.atividade3;

import java.util.Scanner;

public class CalculadoraMetodosEncadeados {


    public static int subtrairNumeros(int x, int y) {
        int resultado = x - y;
        return resultado;
    }

    public static void imprimirResultado(int valor) {
        System.out.println("O resultado da operação é: " + valor);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número (x): ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número (y): ");
        int numero2 = entrada.nextInt();


        int valorCalculado = subtrairNumeros(numero1, numero2);

        imprimirResultado(valorCalculado);
    }
}
