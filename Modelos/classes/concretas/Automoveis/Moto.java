package Modelos.classes.concretas.Automoveis;

import java.util.List;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;

public class Moto extends Automovel{
    public Moto(Modelo modelo,TipoDeMotor tipoDeMotor){
        super(modelo,tipoDeMotor);
    }
    @Override
    public double getValorAlugel() {
        double valorAlugel=this.getModelo().getValorBase();
        List<Acessorio> acessorios =this.getListaAcessorios();
        for (Acessorio acessorio : acessorios) {
            valorAlugel=valorAlugel+acessorio.getValorAcicional();
        }
        valorAlugel=valorAlugel+this.getTipoDeMotor().getValorAdicional();
        return valorAlugel;
    }
    @Override
    public String toString() {
        return "Moto ["+this.getModelo().toString()+" , "+this.getTipoDeMotor().toString()+"]";
    }
}
