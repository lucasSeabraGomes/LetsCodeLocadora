package Servicos.servicosInformacoesAuto;

import java.util.ArrayList;
import java.util.List;


import Modelos.classes.concretas.DadosAutomovel.Marca;
import Recursos.Scan;

public class ServicosMarcas {
    List<Marca> marcas=new ArrayList<>();
    public Marca adicionarMarca(){
        System.out.println("Digite o nome da marca a ser adicionada");
        String nomeMarca=Scan.scan.nextLine();
        Marca marcaAdicionada=new Marca(nomeMarca);
        marcas.add(marcaAdicionada);
        return marcaAdicionada;
    }
    public Marca getMarca(){
        System.out.println("Digite o numero da marca dentre a lista a seguir ou 0 para adicionar nova marca");
        int posicaoMarca=0;
        Marca marcaSelecionada;
        for (Marca marca : marcas) {
            posicaoMarca++;
            System.out.println(posicaoMarca+" - "+marca.getNome());
        }
        posicaoMarca=Scan.scan.nextInt();
        Scan.scan.nextLine();
        if(posicaoMarca==0){
            marcaSelecionada=this.adicionarMarca();
        }else if(posicaoMarca< marcas.size()){
            marcaSelecionada=marcas.get(posicaoMarca-1);
        }else{
            throw new IllegalArgumentException("Marca inexistente");
        }
        return marcaSelecionada;
    }
}
