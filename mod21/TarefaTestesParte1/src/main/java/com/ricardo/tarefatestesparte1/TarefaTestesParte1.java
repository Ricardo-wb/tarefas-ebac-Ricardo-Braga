package com.ricardo.tarefatestesparte1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class TarefaTestesParte1 {

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        popularLista(lista);

        System.out.println("Lista completa: ");
        lista.forEach(p -> System.out.println(p));

        System.out.println();

        System.out.println("Lista de mulheres: ");
        List<Pessoa> listaMulheres = filtrarMulheres(lista);
        listaMulheres.forEach(System.out::println);
    }

    public static List<Pessoa> popularLista(List<Pessoa> lista) {
        lista.add(new Pessoa("Maria", "Feminino"));
        lista.add(new Pessoa("Marcia", "Feminino"));
        lista.add(new Pessoa("Jairo", "Masculino"));
        lista.add(new Pessoa("Jurandir", "Masculino"));
        lista.add(new Pessoa("Clara", "Feminino"));

        return lista;
    }
    
    public static List<Pessoa> filtrarMulheres(List<Pessoa> lista) {
        return lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .toList();
    }
}
