package lista.MapList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MetodosMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus consumos");
        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("Hb20", 14.5);
        carros.put("Kwid", 15.6);

        System.out.println(carros);
        System.out.println("Altere o valor do consumo do Gol para 15.2");
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println("Confira se o modelo Tucson está no dicionário " + carros.containsKey("Tucson"));

        System.out.println("Exiba o consumo do Uno " + carros.get("Uno"));

        System.out.println("Exiba apenas os modelos ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba apenas os consumos ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico");
        Double consumoMaisEficiente = Collections.max(carros.values());

        Set<Entry<String, Double>> entrySet = carros.entrySet();
        String modeloMaisEficiente = "";
        for (Entry<String, Double> entry : entrySet) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente " + modeloMaisEficiente + " : " + consumoMaisEficiente);

            }

        }

        System.out.println("Exiba o modelo menos econômico");
        Double consumoMenosEficiente = Collections.min(carros.values());

        Set<Entry<String, Double>> entrySet1 = carros.entrySet();
        String modeloMenosEficiente = "";
        for (Entry<String, Double> entry : entrySet1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " : " + consumoMenosEficiente);

            }

        }

        System.out.println("Exiba a soma dos  consumos");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Exiba a média dos  consumos "+soma / carros.size());

        System.out.println("Remova os carros com consumo igual a 15.6");
        Iterator<Double> iterator1 = carros.values().iterator();
       
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
         
        }
        System.out.println(carros);

        System.out.println("Exiba os carros ordenando de acordo com a inclusão");
        Map<String, Double> carros1 = new LinkedHashMap<>();
        carros1.put("Gol", 14.4);
        carros1.put("Uno", 15.6);
        carros1.put("Mobi", 16.1);
        carros1.put("Hb20", 14.5);
        carros1.put("Kwid", 15.6);

        System.out.println(carros1);

        System.out.println("Exiba os carros ordenando de acordo com a chave");
        Map<String, Double> carros2 = new TreeMap<>(carros1); 
        System.out.println(carros2);

        System.out.println("Apague o dicionario de carros ");
        carros.clear();
        System.out.println("verifique se foi apagado "+carros.isEmpty());



    }

}
