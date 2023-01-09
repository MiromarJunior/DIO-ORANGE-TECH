package edu.dio.classe.Veiculos;
/**
 @author  Miromar Junior
 @version 1.0
 @since   08/01/2023
*/

public class App {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro();

        carro1.setModelo("GOL");
        carro1.setCor("Preto");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.97));

        Veiculo carro2 = new Carro("AZUL", "HB20", 50);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(3.59));

    }
}
