package org.projetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaMenor18Test {
    @Test
    void deveRetornarInformacoes() {
        PessoaMenor18 pessoa = new PessoaMenor18();
        pessoa.setNome("Marcelo");
        pessoa.setIdade(17);
        assertEquals("PessoaMenor18{nome='Marcelo', idade=17, podetirarCarteira=false}", pessoa.getInfo());
    }
}