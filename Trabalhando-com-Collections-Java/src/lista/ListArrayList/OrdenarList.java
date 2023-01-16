package lista.ListArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarList {
    public static void main(String[] args) {
        // List<Gato> meusGatos = new ArrayList(){{
        //     add(new Gato("Jon",18,"preto"));
        //     add(new Gato("Simba",6,"tigrado"));
        //     add(new Gato("Jon",12,"amarelo"));


        // }};
       
        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Jon", 18,"preto"));
        meusGatos.add(new Gato("Simba",6,"tigrado"));
        meusGatos.add(new Gato("Jon",12,"amarelo"));
        
        // System.out.println("Ordem de Inserção");
        // System.out.println(meusGatos);

        // System.out.println("Ordem Aleátoria");
        // Collections.shuffle(meusGatos);
        // System.out.println(meusGatos);

        // System.out.println("Ordem Natural (Nome)");
        // Collections.sort(meusGatos);
        // System.out.println(meusGatos);

        // System.out.println("Ordem Natural (Idade)" );
        // meusGatos.sort(new ComparatorIdade());
        // System.out.println(meusGatos);

    //     System.out.println("Ordem Natural (Cor)" );
    //     Collections.sort(meusGatos, new ComparatorCor());
    //    // meusGatos.sort(new ComparatorCor());
    //     System.out.println(meusGatos);


    System.out.println("Ordem Nome / Cor / Idade" );
    //Collections.sort(meusGatos, new ComparatorCor());
   meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);
    }
    
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;
    


    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }
    @Override
    public int compareTo(Gato gato2) {
        
        return  gato2.getNome().compareToIgnoreCase(getNome());
    }
    
}
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}