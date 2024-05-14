package model;

public class Emprestimo {

    private int idEmprestimo;
    private int dataEmprestimo;
    private int dataDevolucao;
    private boolean pendente;
    private Ferramenta ferramenta;
    private Amigo amigo;

    public Emprestimo() {
        this(0, 0, 0, true, null, null);
    }
    
    //O Professor recomendou a criação de um construtor sem os objetos
    public Emprestimo(int idEmprestimo, int dataEmprestimo, int dataDevolucao, boolean pendente) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pendente = pendente;
        this.ferramenta = null;
        this.amigo = null;
    }

    public Emprestimo(int idEmprestimo, int dataEmprestimo, int dataDevolucao, boolean pendente, Ferramenta ferramenta, Amigo amigo) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pendente = pendente;
        this.ferramenta = ferramenta;
        this.amigo = amigo;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setId(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
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
