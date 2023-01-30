package Recursos;

import java.util.List;

public class AcessoGenerico {
    public static<T> T getInList(List<T> listaBuscada){
        System.out.println("Selecione o identificador do elemento desejado");
        int posicao=0;
        for (T t : listaBuscada) {
            System.out.println(posicao+" = "+ t.toString());
        }
        posicao=Scan.scan.nextInt();
        Scan.scan.nextLine();
        T retorno=null;
        if(posicao<listaBuscada.size()){
            retorno=listaBuscada.get(posicao);
        }else{
            throw new IllegalArgumentException("Indice invalido");
        }
        return retorno;
    }
}
