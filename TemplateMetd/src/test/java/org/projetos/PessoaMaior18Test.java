package org.projetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaMaior18Test {
    @Test
    void deveRetornarInformacoes() {
        PessoaMaior18 pessoa = new PessoaMaior18();
        pessoa.setNome("Marco");
        pessoa.setIdade(20);
        assertEquals("PessoaMaior18{nome='Marco', idade=20, podetirarCarteira=true}", pessoa.getInfo());
    }
}