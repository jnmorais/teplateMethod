package org.projetos;

public abstract class Pessoa {
    protected String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract boolean podetirarCarteira();

    public String getInfo() {
        return getClass().getSimpleName() + "{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", podetirarCarteira=" + this.podetirarCarteira() +
                '}';
    }
}

