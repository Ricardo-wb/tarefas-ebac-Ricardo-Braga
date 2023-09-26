package br.com.tarefapadroesprojeto1.domain;

/**
 *
 * @author ricar
 */
public class Cliente {

    public Boolean comprarCarro(String modelo) {

        if (modelo == "classico") {
            return true;
        }

        return false;
    }
}
