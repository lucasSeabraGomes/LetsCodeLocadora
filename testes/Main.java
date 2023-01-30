
import Modelos.classes.concretas.Aluguel;
import Modelos.classes.concretas.Pessoas.Cliente;
import Modelos.classes.concretas.Pessoas.Funcionario;
import Servicos.ServicosAlugel;
import Servicos.ServicosPessoas.ServicosPessoas;


public class Main {
    public static void main(String[] args) {

        //testa alugel veiculos
        ServicosPessoas pessoas=new ServicosPessoas();
        ServicosAlugel alugeis= new ServicosAlugel();
        //testa adicionar automoveis
        System.out.println(alugeis.getAutomveis().getAutomovel());
        System.out.println(alugeis.getAutomveis().getAutomovel());
        alugeis.getAutomveis().adicionarAcessorio();
        //testa adicionar usuarios
        Cliente cliente = (Cliente)pessoas.adicionarUsuario();
        Funcionario funcionario = (Funcionario)pessoas.adicionarUsuario();
        //testa adicionar alugueis
        Aluguel aluguel=null;
        try{
                aluguel=alugeis.realizarAluguel(funcionario, cliente);
                System.out.println(aluguel);
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
        //teste de pagamento de alugel
        pessoas.adicionarMeioCliente();
        System.out.println(alugeis.pagarAluguel());
        System.out.println(alugeis.pagarAluguel());
        
    }
}
