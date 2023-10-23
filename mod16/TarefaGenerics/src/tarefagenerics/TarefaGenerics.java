package tarefagenerics;

import java.util.ArrayList;
import java.util.List;
import tarefagenerics.entities.Carro;
import tarefagenerics.entities.Civic;
import tarefagenerics.entities.Fusca;
import tarefagenerics.entities.Meriva;

/**
 *
 * @author ricar
 */
public class TarefaGenerics {

    public static void main(String[] args) {
        
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Civic("Civic", "Honda", "Azul", 1200));
        listaCarros.add(new Fusca("Fusca", "Volkswagen", "Laranja", 15000));
        listaCarros.add(new Meriva("Meriva", "Chevrolet", "Cinza", 60000));
        
        List<Civic> listaCivic = new ArrayList<>();
        listaCivic.add(new Civic("Civic", "Honda", "Azul", 500));
        listaCivic.add(new Civic("Civic", "Honda", "Laranja", 1500));
        listaCivic.add(new Civic("Civic", "Honda", "Cinza", 5000));
        
        System.out.println("LISTA DE CARROS:");
        printListaCarros(listaCarros);
        System.out.println();
        System.out.println("Total de km rodados: " + totalKmRodados(listaCarros));
        
        System.out.println("LISTA DE CIVIC:");
        printListaCarros(listaCivic);
        System.out.println();
        System.out.println("Total de km rodados: " + totalKmRodados(listaCivic));
    }
    
    public static void printListaCarros(List<? extends Carro> lista) {
        for (Carro carro : lista) {
            System.out.println(carro);
        }
    }
    
    public static Integer totalKmRodados(List<? extends Carro> lista) {
        Integer sum = 0;
        
        for (Carro carro : lista) {
            sum += carro.getKmRodados();
        }
        
        return sum;
    }
    
}
