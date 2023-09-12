package view;

import java.util.List;
import java.util.Scanner;

import model.Pessoa;
import model.Sexo;

public class PessoaView {
	private Scanner scanner;

	public PessoaView() {
		scanner = new Scanner(System.in);
	}

	public int menu() {
		System.out.println();
		System.out.println("--------menu-------");
		System.out.println("1-Adicionar Pessoa");
		System.out.println("2-Lista de Pessoas");
		System.out.println("0-Sair.");
		System.out.println();
		System.out.println("Digite sua escolha: ");
		return scanner.nextInt();
	}

	public Sexo menuSexo() {
		int opcao;
		Sexo sexo = Sexo.MASCULINO;
		System.out.println("1 Masculino");
		System.out.println("2 Feminino");
		System.out.println("3 Outros");
		opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			sexo = Sexo.MASCULINO;
			break;
		case 2:
			sexo = Sexo.FEMININO;
			break;
		case 3:
			sexo = Sexo.NUNHUM;
			break;
		default:
			System.out.println("Sexo Invalido!");
		}
		return sexo;
	}

	public void exibirInfo(List<Pessoa> pessoa) {
		System.out.println("------lista de pessoas------");
		System.out.println();
		for (Pessoa p : pessoa) {
			System.out.println("Nome: " + p.getNome()+"  Sexo: "+p.getSexo().getDescricao());
			System.out.println();
			System.out.println("Idade: " + p.getIdade());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Peso: " + p.getPeso());
			System.out.println("imc: "+p.getImc());
			System.out.println();
			System.out.println("----------------------------");
		}
	}

	public String setNome() {
		System.out.println("Digite o nome: ");
		return scanner.next();
	}

	public float setAltura() {
		System.out.println("digite sua altura: ");
		return scanner.nextFloat();
	}

	public int setIdade() {
		System.out.println("digite sua idade: ");
		return scanner.nextInt();
	}

	public float setPeso() {
		System.out.println("digite seu peso: ");
		return scanner.nextFloat();
	}

}
