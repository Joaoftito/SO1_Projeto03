package controller;

public class ThreadVetor extends Thread{
	
	private int[] vetor;
	private int num;
	
	public ThreadVetor(int[] vetor, int num) {
		this.vetor = vetor;
		this.num = num;
	}
	
	@Override
	public void run() {
		ParOuImpar();
	}
	
	private void ParOuImpar() {
		if (num % 2 == 0) {
			double tempoInicial = System.nanoTime();
			
			for (int i = 0 ; i < vetor.length; i++) {
				vetor[i] = vetor[i];
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			
			System.out.println("2 - " + tempoTotal);
		
		} else {
			double tempoInicial = System.nanoTime();
			
			for (int i : vetor) {
				vetor[i] = vetor[i];
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			
			System.out.println("1 - " + tempoTotal);

		}
	}

}
