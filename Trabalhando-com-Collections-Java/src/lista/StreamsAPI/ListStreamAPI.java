package lista.StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
    
    System.out.println("Imprima todos os elementos dessa lista de String");
   // numerosAleatorios.stream().forEach(System.out::println);
   //numerosAleatorios.stream().forEach(s -> System.out.println(s));

//    System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set :");
//    numerosAleatorios.stream()
//    .limit(5)
//    .collect(Collectors.toSet())
//    .forEach(System.out::println);

//    System.out.println("Transforme a lista para numeros inteiros");
//      numerosAleatorios.stream()
//    .map(Integer::parseInt)
//    .collect(Collectors.toList())
//    .forEach(System.out::println);

// System.out.println("Pegue números pares e maiores que 2 e coloque em uma lista");
// numerosAleatorios.stream()
// .map(Integer::parseInt)
// .filter(i-> i % 2 == 0 && i > 2)
// .collect(Collectors.toList())
// .forEach(System.out::println);

// System.out.println("Mostre a média dos números");
// numerosAleatorios.stream()
// .mapToInt(Integer::parseInt)
// .average()
// .ifPresent(System.out::println);

System.out.println("Remova os valores impares");
List<Integer> numeros = numerosAleatorios.stream()
.map(Integer::parseInt)
.collect(Collectors.toList());

numeros.removeIf(integer -> integer % 2 != 0);
System.out.println(numeros);








    
    
    }
    
}
