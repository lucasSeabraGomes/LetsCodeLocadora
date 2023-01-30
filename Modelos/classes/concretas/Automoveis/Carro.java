package Modelos.classes.concretas.Automoveis;

import java.util.List;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;

public class Carro extends Automovel{
    private int numeroDePortas;
    public Carro(Modelo modelo,TipoDeMotor tipoDeMotor, int numeroDePortas){
        super(modelo,tipoDeMotor);
        this.numeroDePortas=numeroDePortas;
    }
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    @Override
    public double getValorAlugel() {
        double valorAlugel=this.getModelo().getValorBase();
        List<Acessorio> acessorios =this.getListaAcessorios();
        for (Acessorio acessorio : acessorios) {
            valorAlugel=valorAlugel+acessorio.getValorAcicional();
        }
        valorAlugel=valorAlugel+this.getTipoDeMotor().getValorAdicional();
        valorAlugel=valorAlugel+((this.numeroDePortas-2)*10.0d);
        return valorAlugel;
    }
    @Override
    public String toString() {
        return "Carro [numeroDePortas=" + numeroDePortas + ", "+this.getModelo().toString()+" , "+this.getTipoDeMotor().toString()+"]";
    }
        
}
