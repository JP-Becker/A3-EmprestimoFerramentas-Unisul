package model;

public class Ferramenta {

    private int idFerramenta;
    private String nomeFerramenta;
    private String marca;
    private double custo;
    private boolean emprestada;

    public Ferramenta() {
        this(0, "", "", 0.0, false);
    }

    // Construtor com valor false no boolean emprestada já que toda ferramenta começa não emprestada
    public Ferramenta(int idFerramenta, String nomeFerramenta, String marca, double custo) {
        this.idFerramenta = idFerramenta;
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.custo = custo;
        this.emprestada = false;
    }
    
    public Ferramenta(int idFerramenta, String nomeFerramenta, String marca, double custo, boolean emprestada) {
        this.idFerramenta = idFerramenta;
        this.nomeFerramenta = nomeFerramenta;
        this.marca = marca;
        this.custo = custo;
        this.emprestada = emprestada;
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
    
    @Override
    public String toString() {
        return "idFerramenta=" + idFerramenta + ", nomeFerramenta=" + nomeFerramenta + ", marca=" + marca + ", custo=" + custo + ", emprestada=" + emprestada;
    }

}
