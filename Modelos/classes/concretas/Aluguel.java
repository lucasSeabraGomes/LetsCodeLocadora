package Modelos.classes.concretas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Modelos.classes.concretas.Pessoas.Cliente;
import Modelos.classes.concretas.Pessoas.Funcionario;
import Modelos.interfaces.Pagamento;
import Modelos.interfaces.ProdutoAlugavel;

public class Aluguel {
    private Cliente cliente;
    private Funcionario responsavel;
    private ProdutoAlugavel produtoAlugado;
    private double valorAlugelTotal;
    private List<Pagamento> parcelasPagamento=new ArrayList<>();
    private Date dataInicio;
    private Date dataFim;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Aluguel(Cliente cliente, Funcionario responsavel, ProdutoAlugavel produtoAlugado, Date dataInicio,
            Date dataFim) {
        this.cliente = cliente;
        this.responsavel = responsavel;
        this.produtoAlugado = produtoAlugado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        // dirença em dias
        long diffInMillies = Math.abs(dataFim.getTime() - dataInicio.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        //valor total do alugel
        double valor=produtoAlugado.getValorAlugel()*diff;
        this.valorAlugelTotal=valor;
    }
    public double getSaldoDevedor(){
        double totalPago=0;
        for (Pagamento pagamento : parcelasPagamento) {
            totalPago+=pagamento.getValorPago();
        }
        return this.valorAlugelTotal-totalPago;
    }
    public void adicionarPagamento(Pagamento pagamento){
        this.parcelasPagamento.add(pagamento);
    }
    @Override
    public String toString() {
        return "Aluguel [cliente=" + cliente + ", responsavel=" + responsavel + ", produtoAlugado=" + produtoAlugado
                + ", valorAlugelTotal=" + valorAlugelTotal + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
                + ", valor a pagar ="+this.getSaldoDevedor()+"]";
    }
    
}
