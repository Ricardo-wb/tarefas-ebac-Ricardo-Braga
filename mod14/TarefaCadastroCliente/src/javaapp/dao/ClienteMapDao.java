package javaapp.dao;

import java.util.HashMap;
import java.util.Map;
import javaapp.domain.Cliente;

/**
 *
 * @author ricar
 */
public class ClienteMapDao implements IClienteDAO {

    private Map<Long, Cliente> mapClientes;

    public ClienteMapDao() {
        this.mapClientes = new HashMap();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.mapClientes.containsKey(cliente.getCpf())) {
            return false;
        }
        this.mapClientes.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.mapClientes.get(cpf);

        if (clienteCadastrado != null) {
            this.mapClientes.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.mapClientes.get(cliente.getCpf());

        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setCpf(cliente.getCpf());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.mapClientes.get(cpf);
    }
}
