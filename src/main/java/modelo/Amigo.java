package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {

    private int idAmigo;
    private String nomeAmigo;
    private String telefone;
    private int emprestimosTotais;
    private int emprestimosAtivos;

    public AmigoDAO dao = new AmigoDAO(); // instanciando a classe amigoDAO para ter acesso aos seus métodos.

    public Amigo() {
        this(0, "", "", 0, 0);
    }

    // Construtor com valor 0 nos emprestimos já que todo amigo começa sem emprestimos
    public Amigo(int idAmigo, String nomeAmigo, String telefone) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.telefone = telefone;
        emprestimosTotais = 0;
        emprestimosAtivos = 0;
    }

    public Amigo(int idAmigo, String nomeAmigo, String telefone, int emprestimosTotais, int emprestimosAtivos) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.telefone = telefone;
        this.emprestimosTotais = emprestimosTotais;
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getEmprestimosTotais() {
        return emprestimosTotais;
    }

    public void setEmprestimosTotais(int emprestimosTotais) {
        this.emprestimosTotais = emprestimosTotais;
    }

    public int getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(int emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    @Override
    public String toString() {
        return "idAmigo=" + idAmigo + ", nomeAmigo=" + nomeAmigo + ", telefone=" + telefone + ", emprestimosTotais=" + emprestimosTotais;
    }

    public String limparTelefone(String telefone) {
        telefone = telefone.replace("-", "");
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        return telefone;
    }

    //Metodos de DAO:
    
    public ArrayList<Amigo> getMinhaLista() {
        return dao.getMinhaLista();
    }

    public Amigo carregaAmigoPorId(int id) {
        return dao.carregaAmigoPorId(id);
    }

    public boolean inserirAmigoBD(int id, String nome, String telefone, int emprestimosTotais, int emprestimosAtivos) {
        id = dao.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone, emprestimosTotais, emprestimosAtivos);
        dao.inserirAmigoBD(objeto);
        return true;
    }

    public int maiorID() {
        return dao.maiorID();
    }

    public boolean deletarAmigoBD(int id) {
        dao.deletarAmigoBD(id);
        return true;
    }

    public boolean atualizarAmigoBD(int id, String nome, String telefone, int emprestimosTotais, int emprestimosAtivos) {
        Amigo objeto = new Amigo(id, nome, telefone, emprestimosTotais, emprestimosAtivos);
        dao.atualizarAmigoBD(objeto);
        return true;
    }

}
