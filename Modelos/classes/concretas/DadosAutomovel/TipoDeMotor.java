package Modelos.classes.concretas.DadosAutomovel;

public class TipoDeMotor {
    private String nome;
    private String descricao;
    private double valorAdicional=0;
    public TipoDeMotor(String nome, String descricao){
        this.descricao=descricao;
        this.nome=nome;
    }
    @Override
    public String toString() {
        return "TipoDeMotor [nome=" + nome + ", descricao=" + descricao + "]";
    }
    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
