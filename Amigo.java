package model;

public class Amigo {

    private int idAmigo;
    private String nomeAmigo;
    private String telefone;
    private int emprestimosTotais;
    private int emprestimosAtivos;

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

}