package Servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Modelos.classes.abtratas.MeioDePagamento;
import Modelos.classes.concretas.Aluguel;
import Modelos.classes.concretas.Pagamentos.Pix;
import Modelos.classes.concretas.Pagamentos.pagamentoCartao;
import Modelos.classes.concretas.Pessoas.Cliente;
import Modelos.classes.concretas.Pessoas.Funcionario;
import Modelos.interfaces.Pagamento;
import Modelos.interfaces.ProdutoAlugavel;
import Recursos.AcessoGenerico;
import Recursos.Scan;
import Servicos.servicosAutomoveis.ServicosAutomoveis;

public class ServicosAlugel {
    List<Aluguel> alugeis=new ArrayList<>();
    ServicosAutomoveis automoveis = new ServicosAutomoveis();
    public Aluguel realizarAluguel(Funcionario funcionario,Cliente cliente) throws IllegalAccessException{
        Aluguel aluguel=null;
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("digite a data de inicio do alugel no formato DD/MM/AAAA");
        
        Date dataInic=null;
        try{
            dataInic=formato.parse(Scan.scan.nextLine());
        }catch(ParseException e){
            throw new IllegalAccessException("O valor da data está mau formatado.");
        }
        System.out.println("digite a data de fim do alugel no formato DD/MM/AAAA");
        
        Date dataFim=null;
        try{
            dataFim=formato.parse(Scan.scan.nextLine());
        }catch(ParseException e){
            throw new IllegalAccessException("O valor da data está mau formatado.");
        }
        ProdutoAlugavel automovel=automoveis.getAutomovel();
        if(dataFim.compareTo(dataInic)!=1){
            throw new IllegalAccessException("A data de inico deve ser inferior a data de fim");
        }
        aluguel=new Aluguel(cliente, funcionario, automovel, dataInic, dataFim);
        alugeis.add(aluguel);
        return aluguel;
    }

    public ServicosAutomoveis getAutomveis(){
        return this.automoveis;
    }
    public Aluguel pagarAluguel(){
        Aluguel pago=null;
        System.out.println("Selecione um alugel para pagar");
        pago=AcessoGenerico.<Aluguel>getInList(alugeis);

        System.out.println("Digite o valor a ser pago até ="+pago.getSaldoDevedor());
        double valorPago;
        valorPago=Scan.scan.nextDouble();
        Scan.scan.nextLine();

        System.out.println("digite 1 para pagar com pix");
        System.out.println("Digite 2 para metodos de pagamento cadastrados");
        int tipoPagamento;
        tipoPagamento=Scan.scan.nextInt();
        Scan.scan.nextLine();
        Pagamento pagamento=null;
        if(tipoPagamento==1){
            
            pagamento=new Pix("teste", valorPago); 
        }
        if(tipoPagamento==2){
            
            pagamento=new pagamentoCartao( AcessoGenerico.<MeioDePagamento>getInList(pago.getCliente().getMeios()),valorPago); 
        }
        pagamento.realizarPagamento();
        pago.adicionarPagamento(pagamento);
        return pago;
    }
}
