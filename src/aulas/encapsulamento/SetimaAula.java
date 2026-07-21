package aulas.encapsulamento;

public class SetimaAula {
    //modificadore de acesso
    int idade; //Default- como se fosse um privado
    public String nome; //Pode ser acessada de qualquer lugar do projeto
    private double altura; // SOMENTE ACESSADA DENTRO DA SUA CLASSE Pai.
    protected  String CPF; // Só pode ser acessado pela classe PAI e Classe FILHAS.

}
