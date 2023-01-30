package Modelos.classes.concretas.Pessoas;

import java.util.ArrayList;
import java.util.List;

import Modelos.classes.abtratas.MeioDePagamento;
import Modelos.interfaces.Autenticavel;
import Recursos.Scan;

public class Cliente implements Autenticavel{
    List<MeioDePagamento> meios= new ArrayList<>();
    private Pessoa pessoa;
    private String senha;
    public Cliente(Pessoa pessoa, String senha){
        this.pessoa=pessoa;
        this.senha=senha;
    }
    
    public List<MeioDePagamento> getMeios() {
        return meios;
    }

    public void addMeioDePagamento(MeioDePagamento meio){
        this.meios.add(meio);
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
   @Override
   public String getChave() {
       // TODO Auto-generated method stub
       return this.getPessoa().getCpf();
   }
@Override
public String toString() {
    return "Cliente [pessoa=" + pessoa + "]";
}
    
}
