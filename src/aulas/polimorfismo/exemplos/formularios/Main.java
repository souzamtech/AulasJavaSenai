package aulas.polimorfismo.exemplos.formularios;

public class Main {
    public static void main(String[] args) {
        Cadastro pessoa1 = new Cadastro("Joao", 22, "Professor", true);
        Cadastro pessoa2 = new Cadastro("Fulano", 33, true);
        Cadastro pessoa3 = new Cadastro("Ciclano", true);
        Cadastro pessoa4 = new Cadastro("Beltrano");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);
    }
}