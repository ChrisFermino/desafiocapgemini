package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificacaoSenhaTest {

    @Test
    void senhaForte() {
        VerificacaoSenha verificacaoSenha = new VerificacaoSenha();
        int resultado = verificacaoSenha.senhaForte("Yabk8(");
        assertEquals(0,resultado);
    }

    @Test
    void senhaFraca() {
        VerificacaoSenha verificacaoSenha = new VerificacaoSenha();
        int resultado = verificacaoSenha.senhaForte("Yabk8");
        assertEquals(1, resultado);
    }
}