package tarefareflaction;

import java.lang.annotation.Annotation;

/**
 *
 * @author ricar
 */
public class TarefaReflaction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TabelaClientes tabelaCliente = new TabelaClientes();

        Class<?> classe = tabelaCliente.getClass();

        if (classe.isAnnotationPresent(Tabela.class)) {
            System.out.println(classe.getAnnotation(Tabela.class).value());
        }
    }

}
