package model;


public class Amigo {
	
    private String nome;
	private String telefone;
	private int emprestimosTotais;
	private int emprestimosAtivos;

	public Amigo() {
		nome = "";
		telefone = "";
		emprestimosTotais = 0;
		emprestimosAtivos = 0;
	}
	
	public Amigo(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.emprestimosTotais = 0;
		this.emprestimosAtivos = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	
}
