package tarefapadroesprojeto1;

import br.com.tarefapadroesprojeto1.domain.Car;
import br.com.tarefapadroesprojeto1.domain.Cliente;
import br.com.tarefapadroesprojeto1.factorys.FabricaAbstrataCarros;
import br.com.tarefapadroesprojeto1.factorys.FabricaCarrosClassicos;
import br.com.tarefapadroesprojeto1.factorys.FabricaCarrosModernos;

/**
 *
 * @author ricar
 */
public class TarefaPadroesProjeto1 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        FabricaAbstrataCarros fabrica = getFabricaCarros(cliente);
            
        Car carro = fabrica.criarCarro();
        carro.printCarro();
    }
    
    public static FabricaAbstrataCarros getFabricaCarros(Cliente cliente) {
        if(cliente.comprarCarro("classico")) {
            return new FabricaCarrosClassicos();
        } else {
            return new FabricaCarrosModernos();
        }
    }
}
