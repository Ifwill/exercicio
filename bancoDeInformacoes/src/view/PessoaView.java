package view;

import java.util.List;
import java.util.Scanner;

import model.Pessoa;

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
	
	public int menuSexo() {
		System.out.println("1.Masculino");
		System.out.println("2.Feminino");
		System.out.println("3.Nao pretende falar");
		return scanner.nextInt();
	}

	public void exibirInfo(List<Pessoa> pessoa) {
		System.out.println("------lista de pessoas------");
		System.out.println();
		for (Pessoa p : pessoa) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: "+ p.getIdade());
			System.out.println("Altura:"+p.getAltura());
			System.out.println("Peso:"+p.getPeso());
			System.out.println("Sexo: "+p.getSexo());
			System.out.println("--------------------------");
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
