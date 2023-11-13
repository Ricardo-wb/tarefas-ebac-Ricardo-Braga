package com.ricardo.service;

import com.ricardo.dao.IContratoDao;

/**
 *
 * @author ricar
 */
public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Contrato excluído com sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Contrato encontrado";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Contrato atualizado";
    }

}
