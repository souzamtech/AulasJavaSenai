import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args){
        String nome = "Matheus";
        int idade = 26;
        boolean professor = true;

        int anoNascimento = 2026 - idade;


        //coments about this.
        //soma +
        //sub -
        //enfim

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(professor);
        System.out.println(anoNascimento);

        Scanner entrada = new Scanner(System.in);

        nome = entrada.nextLine();
        System.out.println(nome);

    }
}
