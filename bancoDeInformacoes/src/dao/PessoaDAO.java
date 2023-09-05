package dao;

import java.util.ArrayList;

import model.Pessoa;
import model.Sexo;

public class PessoaDAO {
	ArrayList<Pessoa> listaDePessoas;
	private Sexo sexo;

	public PessoaDAO() {
		listaDePessoas = new ArrayList<Pessoa>();
	}

	public void adicionarPessoa(String nome, Sexo[] sexos, float altura, int idade, float peso) {
		Pessoa pessoa = new Pessoa(nome,sexos,altura,idade,peso);
		System.out.println("-- TIPO do SEXO: "+pessoa.getSexo());
		//listaDePessoas.add(pessoa);
	}

	public ArrayList<Pessoa> exibirLista() {
		return listaDePessoas;
	}

}
