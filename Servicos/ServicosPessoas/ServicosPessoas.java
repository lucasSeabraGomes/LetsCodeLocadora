package Servicos.ServicosPessoas;

import java.util.ArrayList;
import java.util.List;

import Modelos.classes.abtratas.MeioDePagamento;
import Modelos.classes.concretas.MeiosDepagamento.Cartao;
import Modelos.classes.concretas.Pessoas.Cliente;
import Modelos.classes.concretas.Pessoas.Funcionario;
import Modelos.classes.concretas.Pessoas.Pessoa;
import Modelos.interfaces.Autenticavel;
import Recursos.AcessoGenerico;
import Recursos.Scan;

public class ServicosPessoas {
    List<Funcionario> funcionarios=new ArrayList<>();
    List<Cliente> clientes=new ArrayList<>();
    List<Pessoa> pessoas=new ArrayList<>();
    public Autenticavel adicionarUsuario(){
        Autenticavel novoUsuario=null;
        Pessoa pessoa=getPessoa();
        int tipoUsuario;
        System.out.println("Digite 1 para adicionar um cliente e 2 para adicionar um funcionario");
        tipoUsuario=Scan.scan.nextInt();
        Scan.scan.nextLine();
        System.out.println("Digite a senha do novo usuario");
        String senha=Scan.scan.nextLine();
        if(tipoUsuario==1){
            
            novoUsuario=new Cliente(pessoa, senha);
            clientes.add((Cliente)novoUsuario);
        }
        if(tipoUsuario==2){
            
            novoUsuario=new Funcionario(pessoa, senha);
            funcionarios.add((Funcionario)novoUsuario);
        }
        return novoUsuario;
    }
    public Pessoa adionarPessoa(){
        
        System.out.println("Digite o Cpf da nova pessoa");
        Pessoa pessoa=new Pessoa(Scan.scan.nextLine());
        System.out.println("Digite o nome da nova pessoa");
        pessoa.setNome(Scan.scan.nextLine());
        pessoas.add(pessoa);
        return pessoa;
    };
    public Pessoa getPessoa(){
        System.out.println("Digite o numero identificador da pessoa ou 0 para adicionar nova pessoa.");
        Pessoa pessoa=null;
        int posicao=1;
        for (Pessoa atual : pessoas) {
            System.out.println(posicao+" = "+atual.toString());
            posicao++;
        }
        posicao=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(posicao==0){
            pessoa=adionarPessoa();
        }else if(posicao<=pessoas.size()){
            pessoa=pessoas.get(posicao-1);
        }else{
            throw new IllegalArgumentException("A posição é invalida");
        }
        return pessoa;
    };
    public void adicionarMeioCliente(){
        System.out.println("Selecione o cliente que adicionara o meio de pagamento");
        Cliente cliente=AcessoGenerico.<Cliente>getInList(clientes);
        System.out.println("Digite 1 para adicionar um cartão");
        int tipo=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(tipo==1){
            System.out.println("digite o numero do cartão");
            String numeroCartao =Scan.scan.nextLine();
            System.out.println("digite o nome do titular");
            String nomeTitular =Scan.scan.nextLine();
            System.out.println("digite a validade do cartao");
            String validade =Scan.scan.nextLine();
            System.out.println("digite o CVV");
            String CVV =Scan.scan.nextLine();
            MeioDePagamento cartao=new Cartao(numeroCartao, nomeTitular, validade, CVV);
            cliente.addMeioDePagamento(cartao);
        }
    }
    
}
