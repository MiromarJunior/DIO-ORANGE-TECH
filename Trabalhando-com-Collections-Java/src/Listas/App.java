package Listas;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {

    // Dada uma lista com 7 notas de um aluno[7, 8.5, 9.3, 5, 7, 0 ,3.6] faça

    // Crie uma lista com 7 notas
    List notas = new ArrayList<>();
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6d);
    System.out.println(notas.toString());

    // Exiba a posição da nota 5
    System.out.println(notas.indexOf(5));

    // Adicione a lista nota 8 na posição 4
    notas.add(4, 8d);
    System.out.println(notas.toString());

    // Substituir a nota 5 pela nota 6
    notas.set(notas.indexOf(5), 6d);
    System.out.println(notas.toString());

    //Verifique se a nota 5 está na lista
    System.out.println(notas.contains(5));

    for (Object object : notas) {
      System.out.println(object);
      
    }

  }
}
