package Modelos.classes.abtratas;

public abstract class Acessorio {
    private double valorAcicional;

    public double getValorAcicional() {
        return valorAcicional;
    }

    public void setValorAcicional(double valorAcicional) {
        this.valorAcicional = valorAcicional;
    }
    public abstract boolean validarInsercao(Automovel adicionado);
}
