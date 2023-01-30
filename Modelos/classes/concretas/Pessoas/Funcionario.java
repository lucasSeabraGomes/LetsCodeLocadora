package Modelos.classes.concretas.Pessoas;

import Modelos.interfaces.Autenticavel;

public class Funcionario implements Autenticavel{
    private Pessoa pessoa;
    private String senha;
    private String chave;
    public Funcionario(Pessoa pessoa, String senha){
        this.pessoa=pessoa;
        chave="F"+pessoa.getCpf();
        this.senha=senha;
    }
    @Override
    public String toString() {
        return "Funcionario [pessoa=" + pessoa + "]";
    }
    public String getChave() {
        return chave;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }
    
}
