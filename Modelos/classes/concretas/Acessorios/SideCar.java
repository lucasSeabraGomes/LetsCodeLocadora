package Modelos.classes.concretas.Acessorios;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Automoveis.Moto;

public class SideCar extends Acessorio {
    public SideCar(){
        this.setValorAcicional(100.0d);
    }
    @Override
    public boolean validarInsercao(Automovel adicionado) {
        if(adicionado instanceof Moto){
            return true;
        }
        return false;
    }
    
}
