package atividades.atividade4;

public class ConstrutorDeEscadas {

    // Método desenharEscada recebendo int e char
    public static void desenharEscada(int degraus, char simbolo) {

        for (int i = 1; i <= degraus; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Exemplo: 4, '#'");
        desenharEscada(4, '#');

        System.out.println("\nOutro teste: 6, '*'");
        desenharEscada(6, '*');
    }
}