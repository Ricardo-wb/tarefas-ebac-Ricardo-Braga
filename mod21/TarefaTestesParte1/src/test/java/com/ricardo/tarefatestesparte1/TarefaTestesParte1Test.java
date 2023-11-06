package com.ricardo.tarefatestesparte1;

import static com.ricardo.tarefatestesparte1.TarefaTestesParte1.filtrarMulheres;
import static com.ricardo.tarefatestesparte1.TarefaTestesParte1.popularLista;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricar
 */
public class TarefaTestesParte1Test {

    @Test
    public void filtrarMulheresTeste() {
        List<Pessoa> pessoas = new ArrayList<>();
        popularLista(pessoas);

        List<Pessoa> listaMulheres = filtrarMulheres(pessoas);

        assertTrue(listaMulheres.stream().allMatch(p -> "Feminino".equals(p.getGenero())));
    }
}
