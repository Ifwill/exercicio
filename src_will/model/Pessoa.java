package model;

public class Pessoa {
	private String nome;
	private Sexo sexo;
	private float altura;
	private int idade;
	private float peso;
	private double imc;

	public Pessoa(String nome, Sexo sexo, float altura, int idade, float peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
		this.imc = calculoImc();
	}

	public Pessoa() {
	}

	public double calculoImc() {
		return peso / (altura * altura);
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
