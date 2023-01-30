package Modelos.classes.concretas.Acessorios;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Automoveis.Moto;

public class ArCondicionado extends Acessorio{
    public ArCondicionado(){
        this.setValorAcicional(50.0d);
    }
    @Override
    public boolean validarInsercao(Automovel adicionado) {
        if(adicionado instanceof Moto){
            return false;
        }
        return true;
    }
}
