package atividades.atividade2;

import java.util.Scanner;

public class ListaQuestao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        double valorDesconto = 0.0;

        if (valorCompra < 100.00) {
            valorDesconto = 0.0;
        } else if (valorCompra >= 100.00 && valorCompra <= 299.99) {
            valorDesconto = valorCompra * 0.10;
        } else if (valorCompra >= 300.00) {
            valorDesconto = valorCompra * 0.20;
        }

        double valorFinal = valorCompra - valorDesconto;

        System.out.println(" Resumo da Fatura ");
        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor poupado (desconto): R$ " + valorDesconto);
        System.out.println("Montante final a pagar: R$ " + valorFinal);

    }
}