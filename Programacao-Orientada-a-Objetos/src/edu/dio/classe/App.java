package edu.dio.classe;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setModelo("GOL");
        carro1.setCor("Preto");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.97));

        Carro carro2 = new Carro("AZUL", "HB20", 50);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(3.59));

    }
}
