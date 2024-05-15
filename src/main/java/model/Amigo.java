package model;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Amigo {

	private int idAmigo;
	private String nomeAmigo;
	private String telefone;
	private int emprestimosTotais;
	private int emprestimosAtivos;

	private FerramentaDAO dao;

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

	// Os métodos a seguir referenciam implementacoes futuras da classe DAO
	// Pro netbeans não reclamar, mantenha esse trecho comentado por enquanto
	
	/*
	public ArrayList<Amigo> getMinhaLista() {
		return dao.getMinhaLista();
	}

	public boolean insertAmigoBD(String nome, String telefone, int emprestimosTotais, int emprestimosAtivos) {
		int id = this.maiorID() + 1;
		Amigo objeto = new Amigo(id, nome, telefone, emprestimosTotais, emprestimosAtivos);
		dao.insertAmigoBD(objeto);
		return true;
	}

	public boolean deleteAmigoBD(int id) {
		dao.deleteAmigoBD(id);
		return true;
	}

	public boolean updateAmigoBD(int id, String nome, String telefone, int emprestimosTotais, int emprestimosAtivos) {
		Amigo objeto = new Amigo(id, nome, telefone, emprestimosTotais, emprestimosAtivos);
		dao.updateAmigoBD(objeto);
		return true;
	}

	public Amigo carregaAmigo(int id) {
		return dao.carregaAmigo(id);
	}

	public int maiorID() {
		return dao.maiorID();
	}

	*/

}