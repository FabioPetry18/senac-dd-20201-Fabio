package atividade;

public class Cliente {
	
	private String nome;
	private int dataNascimento;
	private Cidade cidade;
	private double saldo;
	public String getNome() {
		return nome;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}