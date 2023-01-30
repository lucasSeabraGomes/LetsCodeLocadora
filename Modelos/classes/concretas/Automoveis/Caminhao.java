package Modelos.classes.concretas.Automoveis;

import java.util.List;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;

public class Caminhao extends Automovel {
    private int numeroDeEixos;
    public Caminhao(Modelo modelo,TipoDeMotor tipoDeMotor,int numeroDeEixos){
        super(modelo,tipoDeMotor);
        this.numeroDeEixos=numeroDeEixos;
    }
    @Override
    public double getValorAlugel() {
        double valorAlugel=this.getModelo().getValorBase();
        List<Acessorio> acessorios =this.getListaAcessorios();
        for (Acessorio acessorio : acessorios) {
            valorAlugel=valorAlugel+acessorio.getValorAcicional();
        }
        valorAlugel=valorAlugel+this.getTipoDeMotor().getValorAdicional();
        valorAlugel=valorAlugel+((double)this.numeroDeEixos*20.0d);
        return valorAlugel;
    }
    @Override
    public String toString() {
        return "Caminhao [numeroDeEixos=" + numeroDeEixos + ", "+this.getModelo().toString()+" , "+this.getTipoDeMotor().toString()+"]";
    }
}
