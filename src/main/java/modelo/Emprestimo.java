package modelo;

import java.util.Date;

public class Emprestimo {

    private int idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean pendente;
    private Ferramenta ferramenta;
    private Amigo amigo;

    public Emprestimo() {
        this(0, new Date(), new Date(), true, null, null);
    }

    public Emprestimo(int idEmprestimo, Date dataEmprestimo,Date dataDevolucao, boolean pendente, Ferramenta ferramenta, Amigo amigo) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pendente = pendente;
        this.ferramenta = new Ferramenta();
        this.amigo = new Amigo();
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setId(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    //esse toString() não mostra o valor dos objetos, que puxaria o toString() deles e deixaria a linha muito extensa
    //se acharem que é interessante podem adicionar o toString dos objetos nesse
    @Override
    public String toString() {
        return "idEmprestimo=" + idEmprestimo + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + ", pendente=" + pendente;
    }
    
}
