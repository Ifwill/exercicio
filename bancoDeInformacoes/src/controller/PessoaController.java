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
			}

		} while (op != 0);
		System.out.println("fim");
	}

	public void adicionarDados() {
		pessoaDAO.adicionarPessoa(pessoaView.setNome(),Sexo.values() ,pessoaView.setAltura(), pessoaView.setIdade(), pessoaView.setPeso());
		escolha();
		
	}

	public void exibirInfo() {
		ArrayList<Pessoa> listaDePessoas = pessoaDAO.exibirLista();
		pessoaView.exibirInfo(listaDePessoas);
	}

	public int menu() {
		return pessoaView.menu();
	}
	
	public int menuSexo() {
		return pessoaView.menuSexo();
	}

	public Sexo[] escolha() {
		Sexo[] values = Sexo.values();
		int op = 0;
		do {
			switch (pessoaView.menuSexo()) {
			case 1:
				String teste = Sexo.MASCULINO.toString();
				break;
			case 2:
				System.out.println(Sexo.FEMININO.getDescricao());
				break;
			case 3:
				System.out.println(Sexo.NUNHUM.getDescricao());
				break;
			}

		} while (op != 0);
		return Sexo.values();
	}

}
