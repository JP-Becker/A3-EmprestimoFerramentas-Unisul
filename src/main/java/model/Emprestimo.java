package model;

public class Emprestimo {
	
	private int dataEmprestimo;
	private int dataDevolucao;
	private boolean ativo;
	private Ferramenta ferramenta;
	private Amigo amigo;
	
	public Emprestimo() {
		dataEmprestimo = 0;
		dataDevolucao = 0;
		ativo = true;
	}
	
	public Emprestimo(Ferramenta ferramenta, Amigo amigo, int dataEmprestimo, int dataDevolucao) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.ativo = true;
		this.ferramenta = ferramenta;
		this.amigo = amigo;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
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
	
	
    
}
