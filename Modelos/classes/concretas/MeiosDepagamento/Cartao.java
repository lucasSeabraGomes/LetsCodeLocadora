package Modelos.classes.concretas.MeiosDepagamento;

import Modelos.classes.abtratas.MeioDePagamento;
import Modelos.classes.concretas.Pessoas.Cliente;

public class Cartao extends MeioDePagamento {
    String numCartao;
    String nomeTitular;
    String Validade;
    String CVV;
    public Cartao( String numCartao, String nomeTitular, String validade, String cVV) {
        this.numCartao = numCartao;
        this.nomeTitular = nomeTitular;
        Validade = validade;
        CVV = cVV;
    }
    public String getNumCartao() {
        return numCartao;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public String getValidade() {
        return Validade;
    }
    public String getCVV() {
        return CVV;
    }
    @Override
    public String toString() {
        return "Cartao [numCartao=" + numCartao + ", nomeTitular=" + nomeTitular + "]";
    }
    
}
