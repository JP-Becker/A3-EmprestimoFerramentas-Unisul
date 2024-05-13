package model;

public class Ferramenta {

    private int idFerramenta;
    private String nomeFerramenta;
    private String marca;
    private double custo;
    private boolean emprestada;

    public Ferramenta() {
        idFerramenta = 0;
        nomeFerramenta = "";
        marca = "";
        custo = 0.0;
        emprestada = false;
    }

    public Ferramenta(int idFerramenta, String nomeFerramenta, String marca, double custo, boolean emprestada) {
        this.idFerramenta = idFerramenta;
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.custo = custo;
        emprestada = false;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public boolean isEmprestada() {
        return emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

}
