package com.ricardo.service;

import com.ricardo.dao.ClienteDao;
import com.ricardo.dao.IClienteDao;

/**
 *
 * @author ricar
 */
public class ClienteService {
    
    private IClienteDao clienteDao;
    
    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }
    
    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }
}
