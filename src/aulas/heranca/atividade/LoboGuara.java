package aulas.heranca.atividade;

public class LoboGuara extends Animal {


    private String corDaPelagem;

    public String getCorDaPelagem() {
        return corDaPelagem;
    }

    public void setCorDaPelagem(String corDaPelagem) {
        this.corDaPelagem = corDaPelagem;
    }


    public void cacar() {
        System.out.println("O Lobo Guará está caçando no cerrado!");
    }


    @Override
    public void emitirSom() {
        System.out.println("O Lobo Guará está uivando no cerrado!");
    }

    @Override
    public void comer() {
        System.out.println("O Lobo Guará está comendo frutos e pequenos animais.");
    }
}