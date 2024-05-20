package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {

    private int idFerramenta;
    private String nomeFerramenta;
    private String marca;
    private double custo;
    private boolean emprestada;

    private FerramentaDAO dao = new FerramentaDAO(); // instanciando a classe FerramentaDAO para usar seus metodos

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

    public boolean getEmprestada() {
        return emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    @Override
    public String toString() {
        return "idFerramenta=" + idFerramenta + ", nomeFerramenta=" + nomeFerramenta + ", marca=" + marca + ", custo=" + custo + ", emprestada=" + emprestada;
    }

    //Metodos de DAO:
    
    public ArrayList<Ferramenta> getMinhaLista() {
        return dao.getMinhaLista();
    }

    public Ferramenta carregaFerramentaPorId(int id) {
        return dao.carregaFerramentaPorId(id);
    }

    public boolean inserirFerramentaBD(int id, String nome, String marca, double custo, boolean emprestada) {
        id = dao.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo, emprestada);
        dao.inserirFerramentaBD(objeto);
        return true;
    }

    public boolean deletarFerrmanetaBD(int id) {
        dao.deletarFerrmanetaBD(id);
        return true;
    }

    public boolean atualizarFerramentaBD(int id, String nome, String marca, double custo, boolean emprestada) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo, emprestada);
        dao.atualizarFerramentaBD(objeto);
        return true;
    }

    public int maiorID() {
        return dao.maiorID();
    }

}
