package controller;

import java.util.ArrayList;

import dao.PessoaDAO;
import model.Pessoa;
import model.Sexo;
import view.PessoaView;

public class PessoaController {
	private Pessoa pessoa;
	private PessoaView pessoaView;
	private PessoaDAO pessoaDAO;

	public PessoaController() {
		pessoa = new Pessoa();
		pessoaView = new PessoaView();
		pessoaDAO = new PessoaDAO();
	}

	public void start() {
		int op = 0;
		do {
			op = pessoaView.menu();
			switch (op) {
			case 1:
				adicionarDados();
				break;
			case 2:
				exibirInfo();
				break;
			}

		} while (op != 0);
		System.out.println("fim");
	}

	public void adicionarDados() {
		pessoaDAO.adicionarPessoa(pessoaView.setNome(), pessoaView.menuSexo(), pessoaView.setAltura(),
				pessoaView.setIdade(), pessoaView.setPeso());

	}

	public void exibirInfo() {
		ArrayList<Pessoa> listaDePessoas = pessoaDAO.exibirLista();
		pessoaView.exibirInfo(listaDePessoas);
	}

	public int menu() {
		return pessoaView.menu();
	}

	public Sexo menuSexo() {
		return pessoaView.menuSexo();
	}

}
