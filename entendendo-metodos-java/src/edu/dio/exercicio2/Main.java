package edu.dio.exercicio2;

public class Main {
    public static void main(String[] args) {
        Quadrilatero.area(5);
        Quadrilatero.area(8d, 4d);
        Quadrilatero.area(12, 14, 16);
        Quadrilatero.area(9f, 4f);


        double areaQuadrado = QuadrilateroComRetorno.area(3);
        System.out.println("Área do quadrado: " +areaQuadrado );

        double areaRetangulo = QuadrilateroComRetorno.area(2d, 6d);
        System.out.println("Área do retângulo: " +areaRetangulo );

        double areaTrapezio = QuadrilateroComRetorno.area(7, 9, 10);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }

}
