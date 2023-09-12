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

	public void adicionarPessoa(String nome, Sexo sexo, float altura, int idade, float peso) {
		Pessoa pessoa = new Pessoa(nome, sexo, altura, idade, peso);
		listaDePessoas.add(pessoa);
	}

	public ArrayList<Pessoa> exibirLista() {
		return listaDePessoas;
	}

}
