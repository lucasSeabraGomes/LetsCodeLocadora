package Modelos.classes.concretas.Pagamentos;

import Modelos.classes.abtratas.MeioDePagamento;

import Modelos.interfaces.Pagamento;

public class pagamentoCartao implements Pagamento{
    MeioDePagamento cartao;
    double valor;
    
    public pagamentoCartao(MeioDePagamento cartao, double valor) {
        this.cartao = cartao;
        this.valor = valor;
    }

    @Override
    public void apresentaDetalhes() {
        System.out.println("Será pago com cartão o valor de "+valor);
        
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagou com cartão o valor de"+ valor);
        
    }

    @Override
    public void validarInsercao() {
        
        if(this.valor<0){
            throw new IllegalArgumentException("o valor do pagamento não pode ser negativo");
        }
        if(this.cartao==null ){
            throw new IllegalArgumentException("O cartão não pode ser nulo");
        }
        
    }

    @Override
    public double getValorPago() {
        
        return this.valor;
    }
    
}
