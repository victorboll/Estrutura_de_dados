package br.senac.rj.empresa.modelo;

public class Funcionario {
	private int registro;
	private String nome;
	private int cargo;
	private double salario;
	private double bonificacao;
	
	public Funcionario(int registro, String nome, int cargo, double salario) {
		this.registro = registro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aplicarBonificao() {
		switch (this.cargo) {
		case 1:
			this.salario = this.salario * 1.2;
			break;
		case 2:
			this.salario = this.salario * 1.4;
			break;
		case 3:
			this.salario = this.salario * 1.6;
			break;
		}
	}
}
