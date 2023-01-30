package Servicos.servicosInformacoesAuto;

import java.util.ArrayList;
import java.util.List;



import Modelos.classes.concretas.DadosAutomovel.Marca;
import Modelos.classes.concretas.DadosAutomovel.Modelo;
import Recursos.Scan;

public class ServicosModelos {
    static ServicosMarcas marcas=new ServicosMarcas();
    List<Modelo> modelos= new ArrayList<>();


    public Modelo adicionarModelo(){
        
        System.out.println("Digite o nome do modelo a ser adicionado");
        String nomeModelo=Scan.scan.nextLine();
        System.out.println("Digite o ano do modelo a ser adicionado");
        int ano=Scan.scan.nextInt();
        System.out.println("Digite o valor base do alugel do modelo a ser adicionado");
        double valorBase=Scan.scan.nextDouble();
        Marca marcaAdicionada=marcas.getMarca();
        Modelo modeloAdicionado=new Modelo(valorBase, nomeModelo, ano, marcaAdicionada);
        modelos.add(modeloAdicionado);
        return modeloAdicionado;
    }
    public Modelo getModelo(){
        System.out.println("Digite o numero do modelo dentre a lista a seguir ou 0 para adicionar novo modelo");
        int posicaoModelo=0;
        Modelo modeloSelecionado;
        for (Modelo modelo : modelos) {
            posicaoModelo++;
            System.out.println(posicaoModelo+" - "+modelo.getNome());
        }
        posicaoModelo=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(posicaoModelo==0){
            modeloSelecionado=this.adicionarModelo();
        }else if(posicaoModelo< modelos.size()){
            modeloSelecionado=modelos.get(posicaoModelo-1);
        }else{
            throw new IllegalArgumentException("Modelo inexistente");
        }
        return modeloSelecionado;
    }
}
