package aulas.heranca.atividade;

public class AraraAzul extends Animal {


    private double envergaduraAsas;


    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }


    public void voar() {
        System.out.println("A Arara Azul está voando!");
    }

    @Override
    public void comer() {
        System.out.println("A Arara Azul está comendo sementes! ");
    }

    @Override
    public void emitirSom() {
        System.out.println("A Arara Azul está cantando!");
    }
}