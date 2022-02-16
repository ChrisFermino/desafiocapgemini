package models;

import junit.framework.TestCase;
import org.junit.Test;

public class verificacaoAnagramasTest extends TestCase {

    @Test
    public void testSubstringAnagram() {

        verificacaoAnagramas verificacaoAnagramas = new verificacaoAnagramas();
        int resultado = verificacaoAnagramas.substringAnagram("ifailuhkqq");
        assertEquals(3, resultado);
    }
}