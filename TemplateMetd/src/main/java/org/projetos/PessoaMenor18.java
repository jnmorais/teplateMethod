package org.projetos;

public class PessoaMenor18 extends Pessoa {
    @Override
    public boolean podetirarCarteira() {
        return false;
    }
}