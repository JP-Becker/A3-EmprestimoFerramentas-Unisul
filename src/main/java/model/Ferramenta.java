package model;

public class Ferramenta {

    private int idFerramenta;
    private String nome;
    private String marca;
    private double custo;
    private boolean emprestada;

    public Ferramenta() {
        nome = "";
        marca = "";
        custo = 0.0;
        emprestada = false;
    }

    public Ferramenta(int id, String nome, String marca, double custo) {
        this.idFerramenta = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        emprestada = false;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setId(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
