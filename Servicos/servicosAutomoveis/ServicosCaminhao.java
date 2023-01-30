package Servicos.servicosAutomoveis;



import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Automoveis.Caminhao;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;
import Recursos.Scan;

public class ServicosCaminhao {
    public static Automovel adicionarCaminhao(Modelo modelo,TipoDeMotor motor){
        System.out.println("Digite o número de eixos do caminhao");
        int numeroEixos=Scan.scan.nextInt();
        Scan.scan.nextLine();
        Automovel caminhao=new Caminhao(modelo,motor,numeroEixos);
        return caminhao;
    }
}
