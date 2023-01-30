package Validacao;

import Modelos.interfaces.Autenticavel;

public class Autenticacao {
    public static <T extends Autenticavel> boolean autenticar(String chave, String senha,T elemento){
        if(!elemento.getChave().equalsIgnoreCase(chave)){
            return false;
        }
        if(!elemento.getSenha().equalsIgnoreCase(senha)){
            return false;
        }
        return true;
    }
}
