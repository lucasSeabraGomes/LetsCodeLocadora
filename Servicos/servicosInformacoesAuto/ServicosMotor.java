package Servicos.servicosInformacoesAuto;

import java.util.ArrayList;
import java.util.List;


import Modelos.classes.concretas.DadosAutomovel.TipoDeMotor;
import Recursos.Scan;

public class ServicosMotor {
    List<TipoDeMotor> motores= new ArrayList<>();
    public TipoDeMotor adicionarNovoTipo(){
        System.out.println("Digite o nome a ser apresentado pelo tipo de motor");
        String nomeMotor=Scan.scan.nextLine();
        System.out.println("Digite a descrição do motor");
        String descricao=Scan.scan.nextLine();
        System.out.println("Digite o valor adicional do motor");
        double valorBase=Scan.scan.nextDouble();
        TipoDeMotor motorAdicionado=new TipoDeMotor(nomeMotor, descricao);
        motorAdicionado.setValorAdicional(valorBase);
        motores.add(motorAdicionado);
        return motorAdicionado;
    }
    public TipoDeMotor getMotor(){
        System.out.println("Digite o numero do tipo de motor dentre a lista a seguir ou 0 para adicionar novo tipo de motor");
        int posicaoMotor=0;
        TipoDeMotor motorSelecionado;
        for (TipoDeMotor motor : motores) {
            posicaoMotor++;
            System.out.println(posicaoMotor+" - "+motor.getNome());
        }
        posicaoMotor=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(posicaoMotor==0){
            motorSelecionado=this.adicionarNovoTipo();
        }else if(posicaoMotor< motores.size()){
            motorSelecionado=motores.get(posicaoMotor-1);
        }else{
            throw new IllegalArgumentException("Modelo inexistente");
        }

        return motorSelecionado;
    }
}
