package Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {
  public static void main(String[] args) throws Exception {

    // Dada uma lista com 7 notas de um aluno[7, 8.5, 9.3, 5, 7, 0 ,3.6] faça

    // Crie uma lista com 7 notas
    List<Double> notas = new ArrayList<>();
    notas.add(7d);
    notas.add(8.5d);
    notas.add(9.3d);
    notas.add(5d);
    notas.add(8d);
    notas.add(7d);
    notas.add(0d);    
    notas.add(3.6d);
   // System.out.println("Crie uma lista com 7 notas "+notas.toString());

    // Exiba a posição da nota 5
    //System.out.println(" Exiba a posição da nota 5 "+notas.indexOf(5));

    // Adicione a lista nota 8 na posição 4
   // notas.add(4, 8d);
   // System.out.println("Adicione a lista nota 8 na posição 4 "+notas.toString());

    // Substituir a nota 5 pela nota 6
   
   // notas.set(notas.indexOf(5d), 6d);
  //System.out.println("Substituir a nota 5 pela nota 6 "+ notas.toString());/

    //Verifique se a nota 5 está na lista
   // System.out.println("erifique se a nota 5 está na lista "+notas.contains(5));

   // for (Double object : notas) {
   //   System.out.println(object);
      
  //  }
    // Exiba a terceira nota adicionada
   // System.out.println("Exiba a terceira nota adicionada "+notas.get(2));


    //Exiba a menor nota
    //System.out.println("Exiba a menor nota "+ Collections.min(notas));

    // Exiba a Maior nota
   // System.out.println("Exiba a Maior nota "+Collections.max(notas));

    // Exiba a soma dos valores
    // Iterator <Double>interator = notas.iterator();
    // Double soma = 0d;
    // while(interator.hasNext()){
    //   Double next = interator.next();
    //   soma += next;
    // }
    // System.out.println("Exiba a soma dos valores "+soma);

    // //Exiba a média das notas
    // System.out.println("Exiba a média das notas "+soma / notas.size());

    // //Remova a nota 0
    // System.out.println(notas.toString());
    // notas.remove(0d);    
    // System.out.println("Remova a nota 0 : "+notas.toString());

    // //Remova a nota na posição 0
    // System.out.println(notas.toString());
    // notas.remove(0);    
    // System.out.println("Remova a nota na posição 0 : "+notas.toString());

    //Remova as notas menores que 7
    Iterator<Double> iterator = notas.iterator();
    while(iterator.hasNext()){
      Double next = iterator.next();
      if(next < 7)iterator.remove();
    }
    System.out.println("Remova as notas menores que 7 :"+notas.toString());

    //Apague toda a lista
    notas.clear();
    System.out.println(notas.isEmpty());
  }
}
