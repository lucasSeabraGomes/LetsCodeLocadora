package Servicos.servicosAutomoveis;

import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Automoveis.Moto;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;

public class ServicosMoto {
    public static Automovel adicionarMoto(Modelo modelo,TipoDeMotor motor){
        
        Automovel moto=new Moto(modelo,motor);
        return moto;
    }
}
