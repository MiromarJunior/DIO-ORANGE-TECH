package edu.dio.exercicio1;

public class Main {
    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("Exercício sobre a Calculadora");
        Calculadora.soma(10, 15);
        Calculadora.subtracao(25, 30);
        Calculadora.multiplicacao(5,14);
        Calculadora.divisao(1488, 4);

        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(+50);
        Mensagem.obterMensagem(23);

        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(3000, Emprestimo.getTresParcelas());

    }
    
}
