package javaapp.dao;

import javaapp.domain.Cliente;

/**
 *
 * @author ricar
 */
public interface IClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(Long cpf);
}
