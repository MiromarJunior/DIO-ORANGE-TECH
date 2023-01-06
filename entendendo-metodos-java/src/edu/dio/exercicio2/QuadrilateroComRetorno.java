package edu.dio.exercicio2;

public class QuadrilateroComRetorno {
    public static double area(double lado) {
        return lado * lado;
  
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
      
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura;
       
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losângulo: " + diagonal1 * diagonal2);
    }
}
