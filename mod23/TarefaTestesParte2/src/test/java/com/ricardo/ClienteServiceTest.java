package com.ricardo;

import com.ricardo.dao.ClienteDao;
import com.ricardo.dao.mocks.ClienteDaoMock;
import com.ricardo.service.ClienteService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ricar
 */
public class ClienteServiceTest {
    
    @Test
    public void salvarTest(){
        ClienteService service = new ClienteService(new ClienteDaoMock());
        String retorno = service.salvar();
        
        assertEquals("Sucesso", retorno);
    }
    
    @Test (expected = UnsupportedOperationException.class)
    public void esperadoErroAosalvarTest(){
        ClienteService service = new ClienteService(new ClienteDao());
        String retorno = service.salvar();
        
        assertEquals("Sucesso", retorno);
    }
}
