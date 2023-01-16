package lista.SetList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarSetList {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        // Set<Serie> minhasSeries = new HashSet<>();
        // minhasSeries.add(new Serie("Got", "Fantasia", 60));
        // minhasSeries.add(new Serie("Dark", "Drama", 60));
        // minhasSeries.add(new Serie("that ´70s show", "Comédia", 25));
        // System.out.println(minhasSeries);

        // System.out.println("Ordem de Insercao");
        // Set<Serie> minhasSeries1 = new LinkedHashSet<>();
        // minhasSeries1.add(new Serie("Got", "Fantasia", 60));
        // minhasSeries1.add(new Serie("Dark", "Drama", 60));
        // minhasSeries1.add(new Serie("that ´70s show", "Comédia", 25));
        // System.out.println(minhasSeries1);

        System.out.println("Ordem de Insercao");
        Set<Serie> minhasSeries = new LinkedHashSet<Serie>(){{
       add(new Serie("Got", "Fantasia", 60));
        add(new Serie("Dark", "Drama", 60));
        add(new Serie("that ´70s show", "Comédia", 25));

        }};
        Set<Serie> series = new TreeSet<>(minhasSeries);
        System.out.println(series);



        
    }
    
}

