package aulas.heranca.locomocao;
//Herança

public class Veiculo {
    private String marca;
    private String placa;
    private int anoFabricacao;
    private String nomeVeiculo;
    private String cor;
    private String categoria;
    private String cambio;
    private int quilometragem;

    public  void ligar(){
        System.out.println("O seu veículo "+nomeVeiculo +" está sendo iniciado! Bem-vindo! ");

    }

    public  String getNomeVeiculo() {
        return nomeVeiculo;
    }
}
