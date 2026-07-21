package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public  static  void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Fulano", 123456);
        //minhaConta.setTitular("Felipe");
        //System.out.println(minhaConta.getTitular());

        minhaConta.depositar(100);

        ContaBancaria contaDoGustavo = new ContaBancaria("Gustavo",0001);
        contaDoGustavo.depositar(1000);

        System.out.println(contaDoGustavo);


    }
}
