package Modelos.classes.concretas.Pagamentos;

import java.util.Date;

import Modelos.interfaces.Pagamento;

public class Pix implements Pagamento {
    String chave;
    double valor;
    Date dataPagamento;
    public Pix(String chave, double valor)throws IllegalArgumentException {
        this.chave=chave;
        this.valor=valor;
        this.validarInsercao();
    }
    @Override
    public void apresentaDetalhes() {
        System.out.println("Será enviado um pix para: "+ this.chave+" no valor de :"+this.valor);
        
    }
    

    @Override
    public String toString() {
        return "Pix [chave=" + chave + ", valor=" + valor + ", dataPagamento=" + dataPagamento + "]";
    }
    @Override
    public void realizarPagamento() {
        this.dataPagamento=new Date();
        System.out.println("Enviou "+this.valor+" com pix para chave "+ this.chave+" no dia "+this.dataPagamento);
        
        
    }

    @Override
    public void validarInsercao()throws IllegalArgumentException {
        if(this.valor<0){
            throw new IllegalArgumentException("o valor do pagamento não pode ser negativo");
        }
        if(this.chave==null ){
            throw new IllegalArgumentException("A chave não pode ser nula");
        }
        if(this.chave.equals("") ){
            throw new IllegalArgumentException("A chave não pode ser nula");
        }
    }
    @Override
    public double getValorPago() {
        
        return this.valor;
    }
    
}
