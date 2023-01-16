package lista.MapList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenarMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário de livros Ordem aleatória");

        Map<String,Livro> livros = new HashMap<>();
        livros.put( "HawKing, Stephen", new Livro("Uma Breve Hitória do tempo", 256));
        livros.put( "Duhigg, Charles", new Livro("O poder do hábito", 408));
        livros.put( "Harari, Yuval Noah", new Livro("21 Lições para o seculo 21", 432));
        
        for ( Map.Entry<String, Livro> l : livros.entrySet()) {
            System.out.println(l.getKey() + " + "+l.getValue().getNome());
            
        }
        System.out.println("Exibir livros Ordem de inserção");
        Map<String,Livro> livros1 = new LinkedHashMap<>();
       
        livros1.put( "HawKing, Stephen", new Livro("Uma Breve Hitória do tempo", 256));
        livros1.put( "Duhigg, Charles", new Livro("O poder do hábito", 408));
        livros1.put( "Harari, Yuval Noah", new Livro("21 Lições para o seculo 21", 432));
        
        System.out.println(livros1);
    
        System.out.println("\nExibir livros Ordem de alfabetica dos Autores");
        Map<String,Livro> livros2 = new TreeMap<>(livros);
        for ( Map.Entry<String, Livro> l : livros2.entrySet()) {
            System.out.println(l.getKey() + " + "+l.getValue().getNome());
            
        }

        System.out.println("\nExibir livros Ordem de alfabetica dos nomes dos livros");
        Set<Map.Entry<String,Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll(livros.entrySet());
        for ( Map.Entry<String, Livro> l : livros3) {
            System.out.println(l.getKey() + " + "+l.getValue().getNome());
            
        }
    
    }


    
}

class Livro{
    private String nome;
    private Integer paginas;
    
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Livro [Nome : " + nome + ", paginas : " + paginas + "]";
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
       
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}