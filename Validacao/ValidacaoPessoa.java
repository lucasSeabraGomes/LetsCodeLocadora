package Validacao;



public class ValidacaoPessoa {
    public static boolean validarCPF(String cpf){
        if(cpf.length()!=11){
            return false;
        }
        return true;
    }
    public static boolean validarNome(String nome){
        if(nome.equals("")||nome==null){
            return false;
        }
        return true;
    }
}
