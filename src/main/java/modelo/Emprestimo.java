package modelo;

import java.util.ArrayList;
import dao.EmprestimoDAO;
import java.util.Date;

public class Emprestimo {

    private int idEmprestimo;

    private int idAmigo;
    private int idFerramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean pendente;
    private Ferramenta ferramenta;
    private Amigo amigo;
    public EmprestimoDAO dao; // instanciando a classe emprestimoDAO para ter acesso aos seus métodos.
    
    
    public Emprestimo() {
        this(0, 0, 0, new Date(), null, true, null, null);
    }
    
    //Construtor sem os objetos Amigo e Ferramenta como recomendado pelo professor. Por favor não apagar de novo
    public Emprestimo(int idEmprestimo, int idAmigo, int idFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean pendente) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pendente = pendente;
        this.ferramenta = new Ferramenta();
        this.amigo = new Amigo();
        this.dao = new EmprestimoDAO();
    }

    public Emprestimo(int idEmprestimo, int idAmigo, int idFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean pendente, Ferramenta ferramenta, Amigo amigo) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigo = idAmigo;
        this.idFerramenta = idFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pendente = pendente;
        this.ferramenta = new Ferramenta();
        this.amigo = new Amigo();
        this.dao = new EmprestimoDAO();
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }
    
    
    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
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

    public boolean getPendente() {
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
        return "idEmprestimo=" + idEmprestimo + "idAmigo= " + idAmigo + "idFerramenta= " + idFerramenta + "dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + ", pendente=" + pendente;
    }

    // Os métodos a seguir referenciam implementacoes futuras da classe DAO
    // Pro netbeans não reclamar, mantenha esse trecho comentado até EmprestimoDAO ser implementado
    
    
    public ArrayList<Emprestimo> getMinhaLista() {
        return dao.getMinhaLista();
    }

    
    public Emprestimo carregaEmprestimoPorId(int id) {
        return dao.carregaEmprestimoPorId(id);
    }

     public int maiorID() {
        return dao.maiorID();
    }
    
    public boolean inserirEmprestimoBD(int id, int idAmigo, int idFerramenta, Date dataEmprestimo, boolean pendente, Ferramenta ferramenta, Amigo amigo) {
        id = dao.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(id, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao, pendente, ferramenta, amigo);
        dao.inserirEmprestimoBD(objeto);
        return true;
    }
    
    public boolean deletarEmprestimoBD(int id) {
        dao.deletarEmprestimoBD(id);
        return true;
    }

    public boolean atualizarEmprestimoBD(int id, int idAmigo, int idFerramenta, Date dataEmprestimo, Date dataDevolucao, boolean pendente, Ferramenta ferramenta, Amigo amigo) {
        Emprestimo objeto = new Emprestimo(id, idAmigo, idFerramenta,dataEmprestimo, dataDevolucao, pendente, ferramenta, amigo);
        dao.atualizarEmprestimoBD(objeto);
        return true;
    }
    
}
