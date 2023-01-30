package Modelos.classes.abtratas;

import java.util.ArrayList;
import java.util.List;

import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;
import Modelos.interfaces.ProdutoAlugavel;

public abstract class Automovel implements ProdutoAlugavel  {
    private Modelo modelo;
    private TipoDeMotor tipoDeMotor;
    private List<Acessorio> acessorios=new ArrayList<>();
    
    public void adicionarAcessorio(Acessorio acessorio){
        if(acessorio.validarInsercao(this)){
            acessorios.add(acessorio);
        };
    }
    public List<Acessorio> getListaAcessorios(){
        return this.acessorios;
    }
    public TipoDeMotor getTipoDeMotor() {
        return tipoDeMotor;
    }


    public void setTipoDeMotor(TipoDeMotor tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }



    public Modelo getModelo() {
        return modelo;
    }



    public Automovel(Modelo modelo,TipoDeMotor tipoDeMotor){
        this.modelo=modelo;
        this.tipoDeMotor=tipoDeMotor;
    }
}
