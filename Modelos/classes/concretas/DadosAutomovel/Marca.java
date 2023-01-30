package Modelos.classes.concretas.DadosAutomovel;

public class Marca {
    private String nome;
    public Marca(String nome){
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Marca [nome=" + nome + "]";
    }
}
