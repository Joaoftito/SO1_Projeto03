package view;

import controller.ThreadPing;

public class Main {

	public static void main(String[] args) {
		String os = System.clearProperty("os.name");
		String[] vetor = os.split(" ");
		String[] sites = { "www.uol.com.br", "www.terra.com.br", "www.google.com.br" };

		if (vetor[0].contains("Linux")) {
			for (int i = 0; i < 3; i++) {
				Thread thread = new ThreadPing(vetor, sites, i);
				thread.start();
			}
		} else {
			System.err.println("Este programa só identifica sistemas Linux!");
		}

	}
}
