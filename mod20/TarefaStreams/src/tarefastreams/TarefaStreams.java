package tarefastreams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class TarefaStreams {

    public static void main(String[] args) {
       List<Pessoa> lista = new ArrayList<>();
       
       popularLista(lista);
       
       System.out.println("Lista completa: ");
       lista.forEach(p -> System.out.println(p));
       
       System.out.println();
       
       System.out.println("Lista de mulheres: ");
       lista.stream()
               .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
               .forEach(System.out::println);
    }
    
        public static List<Pessoa> popularLista(List<Pessoa> lista) {
        lista.add(new Pessoa("Maria", "Feminino"));
        lista.add(new Pessoa("Marcia", "Feminino"));
        lista.add(new Pessoa("Jairo", "Masculino"));
        lista.add(new Pessoa("Jurandir", "Masculino"));
        lista.add(new Pessoa("Clara", "Feminino"));
        
        return lista;
    }
}
