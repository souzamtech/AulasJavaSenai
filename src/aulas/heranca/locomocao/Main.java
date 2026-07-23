package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {

        // 1. Usando o CONSTRUTOR para dar o nome no momento exato em que o objeto nasce
        Carro carro = new Carro();
        Moto motoEletrica = new MotoEletrica();
        Moto motoCombustao = new MotoCombustao();

        motoEletrica.abastecer();
        motoCombustao.abastecer();

        // 2. Chamando os métodos normalmente 21/07 aula
        //carro.nomeVeiculo = "Jaguar";
        carro.ligar(); //aula 22/07
        carro.ligarArCondicionado(); //aula 22/07

        //moto.cor = "Preto"; Aula dia 21/07
       // moto.puxarPezinho();
        // 3. Se você precisasse mudar o nome DEPOIS de criado, usaria o SETTER:
        // moto.setNomeVeiculo("Yamaha");
    }
}