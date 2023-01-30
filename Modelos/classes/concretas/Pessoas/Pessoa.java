package Modelos.classes.concretas.Pessoas;

import Validacao.ValidacaoPessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome)throws IllegalArgumentException {
        if(ValidacaoPessoa.validarNome(nome)){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
    }
    public String getCpf() {
        return cpf;
    }
    public Pessoa(String cpf)throws IllegalArgumentException{
        if(ValidacaoPessoa.validarCPF(cpf)){
            this.cpf=cpf;
        }else{
            throw new IllegalArgumentException("O cpf deve ter 11 caracteres.");
        }
    }
}
