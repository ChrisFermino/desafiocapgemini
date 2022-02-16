package models;

import org.junit.Assert;
import org.junit.Test;

public class EscadaTest {

    @Test
    public void testPrintEscada() {

        Escada escada = new Escada();
        String resultado = escada.printEscada(3);
        Assert.assertEquals("  *\n **\n***", resultado);
    }
}