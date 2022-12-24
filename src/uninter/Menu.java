package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc; // Para o usuário responder
	private Cofrinho cofrinho;

	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void mostrarMenuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");

		String opcaoEscolhida = sc.next(); // Guarda o resultado em uma variável

		switch (opcaoEscolhida) {
			case "0":
				System.out.println("Encerrando programa...");
				break;
			case "1":
				mostrarSubMenuAdicionarMoedas();
				mostrarMenuPrincipal();
				break;
			case "2":
				mostrarSubMenuRemoverMoedas();
				mostrarMenuPrincipal();
				break;
			case "3":
				cofrinho.listagemMoedas();
				mostrarMenuPrincipal();
				break;
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				System.out.println("O valor total convertido para Real é: " + valorTotalConvertido);
				mostrarMenuPrincipal();
				break;
			default:
				System.out.println("Opção Inválida!");
				mostrarMenuPrincipal();
				break;
		}
	}

	private void mostrarSubMenuAdicionarMoedas() {
		System.out.println("Escolha moeda:");
		System.out.println("1- Real");
		System.out.println("2- Dolar");
		System.out.println("3- Euro");

		int moedaOpcao = sc.nextInt();
		System.out.println("Digite o valor:");

		double valorMoeda = sc.nextDouble();

		Moeda moeda = null;

		if (moedaOpcao == 1) {
			moeda = new Real(valorMoeda);
		} else if (moedaOpcao == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (moedaOpcao == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda");
			mostrarMenuPrincipal();
		}

		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada com sucesso");
	}

	private void mostrarSubMenuRemoverMoedas() {
		System.out.println("Escolha moeda:");
		System.out.println("1- Real");
		System.out.println("2- Dolar");
		System.out.println("3- Euro");

		int moedaOpcao = sc.nextInt();
		System.out.println("Digite o valor:");

		double valorMoeda = sc.nextDouble();

		Moeda moeda = null;

		if (moedaOpcao == 1) {
			moeda = new Real(valorMoeda);
		} else if (moedaOpcao == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (moedaOpcao == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda");
			mostrarMenuPrincipal();
		}

		cofrinho.remover(moeda);
		System.out.println("Moeda removida com sucesso");
	}

}
