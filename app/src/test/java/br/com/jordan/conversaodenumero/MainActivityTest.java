package br.com.jordan.conversaodenumero;

import junit.framework.TestCase;

/**
 * Created by User on 03/07/2017.
 */

public class MainActivityTest extends TestCase{
    public void testconversaoDeNumero(){
        String resultado = MainActivity.numero(278);
        int teste = MainActivity.retornaNumeros(874);
        assertEquals("duzentos e setenta e oito", resultado);
        assertEquals(74, teste);
    }
}
