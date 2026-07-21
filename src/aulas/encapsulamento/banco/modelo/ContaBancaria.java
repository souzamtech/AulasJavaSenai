package aulas.encapsulamento.banco.modelo;

public class ContaBancaria {
    //1.Criar os atributos dessa classe
    private String titular;
    private  int numeroDaConta;
    private double saldo; //Tem mais caracteres e o FLOAT tem menos caracteres. Por isso usamos o double porque ele tem mais numeros

    //Construtor dessa classe
    public ContaBancaria(String titular, int numeroDaConta){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;

    }

    //metodos Gets e Sets

    //méotodo  para modificar o valor dentro da
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor +"Valor foi depositado");
        } else {
            System.out.println("Erro: valor valor inválido");
        }
    }

    private void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(valor + "foi retirado da conta");

        }
    }


    //metodos provados tamem so podem ser acessados dentro da classe que foram criados
    private String acessarTodosOSDados(){
        return this.titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }
}
