package model;

public class Ferramenta {
	
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
	
	public Ferramenta(String nome, String marca, double custo) {
		this.nome = nome;
		this.marca = marca;
		this.custo = custo;
		emprestada = false;
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
