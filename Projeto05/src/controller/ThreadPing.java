package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread {

	private String[] vetor;
	private String[] sites;
	private int i;

	public ThreadPing(String[] vetor, String[] sites, int i) {

		this.vetor = vetor;
		this.sites = sites;
		this.i = i;

	}

	@Override
	public void run() {
		ping();

	}

	private void ping() {

		String proc = "ping -4 -c 10 site";

		vetor = proc.split(" ");
		vetor[4] = sites[i];
		proc = vetor[4];

		try {
			Process p = Runtime.getRuntime().exec(vetor);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();

			while (linha != null) {

				if (proc.contains("www.uol.com")) {

					if (linha.contains("time=")) {
						vetor = linha.split("=");
						System.out.println("Uol = " + vetor[3]);
					}

					if (linha.contains("avg")) {
						vetor = linha.split("/");
						System.out.println("Uol Ping Média = " + vetor[4]);
					}
				} else {

					if (proc.contains("www.terra.com")) {

						if (linha.contains("time=")) {
							vetor = linha.split("=");
							System.out.println("Terra = " + vetor[3]);
						}

						if (linha.contains("avg")) {
							vetor = linha.split("/");
							System.out.println("Terra Ping Média = " + vetor[4]);
						}
					} else {

						if (proc.contains("www.google.com")) {

							if (linha.contains("time=")) {
								vetor = linha.split("=");
								System.out.println("Google = " + vetor[3]);
							}

							if (linha.contains("avg")) {
								vetor = linha.split("/");
								System.out.println("Google Ping Média = " + vetor[4]);
							}
						}
					}
				}

				linha = buffer.readLine();

			}

			buffer.close();
			leitor.close();
			fluxo.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
