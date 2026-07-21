package aulas.encapsulamento.banco.principal;

import aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public  static  void main(String[] args) {
        //minhaConta.setTitular("Felipe");
        //System.out.println(minhaConta.getTitular());

        ContaBancaria pessoa1 = new ContaBancaria("Gustavo");
        ContaBancaria pessoa2 = new ContaBancaria("Matheus");
        ContaBancaria pessoa3 = new ContaBancaria("Raul");

        pessoa1.depositar(200);
        pessoa2.depositar(2000);
        pessoa3.depositar(200);

        System.out.println("A pessoa " + pessoa1.getTitular()+ " depositou");
        pessoa1.depositar(200);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);



    }
}
