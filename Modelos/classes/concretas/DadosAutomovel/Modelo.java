package Modelos.classes.concretas.DadosAutomovel;

public class Modelo {
    private Double valorBase;
    private String nome;
    private int ano;
    private Marca marca;
    public Modelo(double valorBase, String nome, int ano, Marca marca){
        this.valorBase=valorBase;
        this.nome=nome;
        this.ano=ano;
        this.marca=marca;

    }


    @Override
    public String toString() {
        return "Modelo [nome=" + nome + ", ano=" + ano + ", marca=" + marca + "]";
    }


    public Double getValorBase() {
        return valorBase;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }
    public Marca getMarca() {
        return marca;
    }

}
