package br.com.tarefapadroesprojeto1.factorys;

import br.com.tarefapadroesprojeto1.domain.Car;
import br.com.tarefapadroesprojeto1.domain.CarroModerno;

/**
 *
 * @author ricar
 */
public class FabricaCarrosModernos implements FabricaAbstrataCarros{

    @Override
    public Car criarCarro() {
        return new CarroModerno();
    }
    
}
