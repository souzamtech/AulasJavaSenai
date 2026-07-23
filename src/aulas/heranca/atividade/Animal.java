package aulas.heranca.atividade;

public class Animal {
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSetorNoZoo() {
        return setorNoZoo;
    }

    public void setSetorNoZoo(String setorNoZoo) {
        this.setorNoZoo = setorNoZoo;
    }

    private String setorNoZoo;

    public void emitirSom(){
        System.out.println("O animal está emitindo um som...");
    }

    public void comer(){
        System.out.println("O animal está  comendo ");
    }
}


