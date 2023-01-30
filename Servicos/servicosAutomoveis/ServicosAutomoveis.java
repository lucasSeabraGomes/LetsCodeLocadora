package Servicos.servicosAutomoveis;

import java.util.ArrayList;
import java.util.List;

import Modelos.classes.abtratas.Acessorio;
import Modelos.classes.abtratas.Automovel;
import Modelos.classes.concretas.Acessorios.ArCondicionado;
import Modelos.classes.concretas.Acessorios.SideCar;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;
import Recursos.AcessoGenerico;
import Recursos.Scan;
import Servicos.servicosInformacoesAuto.ServicosModelos;
import Servicos.servicosInformacoesAuto.ServicosMotor;

public class ServicosAutomoveis {
    List<Automovel> automoveis =new ArrayList<>();
    static ServicosModelos modelos=new ServicosModelos();
    static ServicosMotor motores= new ServicosMotor();
    
    
    public void adicionarAcessorio(){
        System.out.println("Selecione o automovel onde foi adicionado este acessório");
        Automovel automovelSelecionado=AcessoGenerico.<Automovel>getInList(automoveis);
        System.out.println("Digite 1 para adicionar um ar condicionado");
        System.out.println("Digite 2 para adicionar um sidecar");
        int tipo =Scan.scan.nextInt();
        Acessorio acessorio=null;
        if(tipo==1){
            acessorio=new ArCondicionado();
        }
        if(tipo==2){
            acessorio=new SideCar();  
        }
        automovelSelecionado.adicionarAcessorio(acessorio);
    }
    public Automovel adicionarAutomovel(){
        Modelo modelo=modelos.getModelo();
        TipoDeMotor motor=motores.getMotor();
        Automovel automovelAdicionado=null;
        System.out.println("Selecione o tipo de automovel:");
        System.out.println("Digite 1 para carro");
        System.out.println("Digite 2 para moto");
        System.out.println("Digite 3 para caminhão");
        int escolha= Scan.scan.nextInt();
        Scan.scan.nextLine();
        switch(escolha){
            case 1:
                automovelAdicionado=ServicosCarro.adicionarCarro(modelo, motor);
                break;
            case 2:
                automovelAdicionado=ServicosMoto.adicionarMoto(modelo, motor);
                break;
            case 3:
                automovelAdicionado=ServicosCaminhao.adicionarCaminhao(modelo, motor);
                break;

        }
        automoveis.add(automovelAdicionado);
        return automovelAdicionado;
    }
    public Automovel getAutomovel(){
        System.out.println("Digite o numero do codigo para o automovel desejado dentro da lista a seguir ou 0 para adicionar um novo automovel");
        int posicaoAutomovel=0;
        Automovel automovelSelecionado=null;
        for (Automovel automovel : automoveis) {
            posicaoAutomovel++;
            System.out.println(posicaoAutomovel+" = "+automovel.toString());
        }
        posicaoAutomovel=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(posicaoAutomovel==0){
            automovelSelecionado=adicionarAutomovel();
        }else if(posicaoAutomovel<=automoveis.size()){
            automovelSelecionado=automoveis.get(posicaoAutomovel-1);
        }else{
            throw new IllegalArgumentException("Automovel inexistente");
        }
        return automovelSelecionado;
    }

    
}
