package com.ricardo;

import com.ricardo.dao.ContratoDao;
import com.ricardo.dao.mocks.ContratoDaoMock;
import com.ricardo.service.ContratoService;
import com.ricardo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ricar
 */
public class ContratoServiceTest {

    @Test
    public void salvarContratoTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoSalvarContratoTest() {
        IContratoService service = new ContratoService(new ContratoDao());
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirContratoTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        String retorno = service.excluir();

        Assert.assertEquals("Contrato excluído com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirContratoTest() {
        IContratoService service = new ContratoService(new ContratoDao());
        String retorno = service.excluir();

        Assert.assertEquals("Contrato excluído com sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        String retorno = service.buscar();

        Assert.assertEquals("Contrato encontrado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarContratoTest() {
        IContratoService service = new ContratoService(new ContratoDao());
        String retorno = service.buscar();

        Assert.assertEquals("Contrato encontrado", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        String retorno = service.atualizar();

        Assert.assertEquals("Contrato atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarContratoTest() {
        IContratoService service = new ContratoService(new ContratoDao());
        String retorno = service.buscar();

        Assert.assertEquals("Contrato atualizado", retorno);
    }
}
