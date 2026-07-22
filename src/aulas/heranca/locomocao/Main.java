package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {

        // 1. Usando o CONSTRUTOR para dar o nome no momento exato em que o objeto nasce
        Carro carro = new Carro();
        Moto moto = new Moto();
        // 2. Chamando os métodos normalmente
        carro.nomeVeiculo = "Jaguar";
        carro.ligar();
        carro.ligarArCondicionado();

        moto.cor = "Preto";
        moto.puxarPezinho();
        // 3. Se você precisasse mudar o nome DEPOIS de criado, usaria o SETTER:
        // moto.setNomeVeiculo("Yamaha");
    }
}