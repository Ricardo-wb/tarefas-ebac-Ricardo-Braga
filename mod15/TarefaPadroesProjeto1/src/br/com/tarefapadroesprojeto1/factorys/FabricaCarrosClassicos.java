package br.com.tarefapadroesprojeto1.factorys;

import br.com.tarefapadroesprojeto1.domain.Car;
import br.com.tarefapadroesprojeto1.domain.CarroClassico;

/**
 *
 * @author ricar
 */
public class FabricaCarrosClassicos implements FabricaAbstrataCarros {

    @Override
    public Car criarCarro() {
        return new CarroClassico();
    }

}
