import java.util.Scanner;

public class VerificadorDeAcessoSeguranca {


    public static boolean verificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idadeUsuario = entrada.nextInt();


        boolean permissao = verificarMaioridade(idadeUsuario);


        if (permissao == true) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }

    }
}