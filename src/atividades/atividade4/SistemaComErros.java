package atividades.atividade4;

    public static void main(String[] args) {

        int valor1 = 10;
        int contador = 5; //  Adicionado o ponto e vírgula que necessita ter para rodar o código

        // Adicionado o segundo parâmetro (número de repetições para fortalecer o código e ter parametros designados)
        exibirMensagens("Bem-vindo ao sistema", 1);

        while (contador > 0) {
            System.out.println("Iniciando em: " + contador);
            contador--; // colocado o contador para evitar loop infinito e atrapalhar o uso
        }

    }

    //  Adicionado o static para poder ser chamado direto no main
    public static void exibirMensagens(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }


} //  a chave de fechamento que necessita ter no código, havia uma a mais.