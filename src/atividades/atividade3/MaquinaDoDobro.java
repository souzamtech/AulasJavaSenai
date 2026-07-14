
package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {


    public static int calcularDobro(int numero) {
        int resultado = numero * 2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();


        int dobro = calcularDobro(numero);

        System.out.println("O dobro do número é: " + dobro);

        entrada.close();
    }
}