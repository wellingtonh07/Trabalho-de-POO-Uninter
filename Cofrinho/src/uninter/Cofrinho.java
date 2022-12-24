package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}

	public void listagemMoedas() {
		if (listaMoedas.isEmpty()) {
			System.out.println("Não contém nenhuma moeda no cofrinho");
			return;
		}

		for (Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		if (listaMoedas.isEmpty()) {
			return 0;
		}
		double valorAcumulado = 0;

		for (Moeda moeda : listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}

		return valorAcumulado;
	}
}
