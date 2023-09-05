package model;

public class Pessoa {
	private String nome;
	private Sexo sexo;
	private float altura;
	private int idade;
	private float peso;

	public Pessoa(String nome, Sexo[] sexos, float altura, int idade, float peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
	}
	
	public Pessoa() {
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

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
