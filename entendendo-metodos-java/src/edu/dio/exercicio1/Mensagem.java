package edu.dio.exercicio1;

public class Mensagem {
    public static void obterMensagem(int hora) {
        if (hora > 4 && hora < 13) {
            mensagemBomDia();
        } else if (hora > 12 && hora < 18) {
            mensagemBoaTarde();
        } else if (hora < 0 || hora > 23) {
            mensagemErro();
        } else {
            mensagemBoaNoite();
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite");
    }

    public static void mensagemErro() {
        System.out.println("Hora inválida");
    }

}
