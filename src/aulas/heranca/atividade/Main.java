package aulas.heranca.atividade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Zoológico de Brasília!");

        Animal lobo = new LoboGuara();
        lobo.emitirSom();

        Animal loboComendo = new LoboGuara();
        lobo.comer();


        Animal arara = new AraraAzul();
        arara.comer();

        Animal araraSom = new AraraAzul();
        arara.emitirSom();


    }
}
