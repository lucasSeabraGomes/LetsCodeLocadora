package Servicos.servicosAutomoveis;



import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Automoveis.Carro;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;
import Recursos.Scan;

public class ServicosCarro {
    public static Automovel adicionarCarro(Modelo modelo,TipoDeMotor motor){
        System.out.println("Digite o número de portas do carro");
        int numeroPortas=Scan.scan.nextInt();
        Automovel carro=new Carro(modelo,motor,numeroPortas);
        return carro;
    }
}
