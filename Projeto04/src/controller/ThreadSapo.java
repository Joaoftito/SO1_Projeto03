package controller;

public class ThreadSapo extends Thread {

	private int i;
	private int salto;
	private int distancia = 500;
	private int percorreu;

	public ThreadSapo(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		Corrida();
	}

	private void Corrida() {
		i = i + 1;

		while (distancia > 0) {

			salto = (int) ((Math.random() * 40) + 0);
			distancia = distancia - salto;
			percorreu = percorreu + salto;

			System.out.println("Sapo " + i + " saltou " + salto + " metros e percorreu " + percorreu + " metros");

			if (percorreu >= 500) {

				System.out.println("Sapo " + i + " terminou!");
			}

		}

	}

}
