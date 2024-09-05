package view;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		int num = 0;
		
		for (int i = 0 ; i < vetor.length ; i ++) {
			vetor[i] = num = (int)((Math.random() * 100) + 1);
		}

		for (int i = 0 ; i < 2 ; i ++) {
			num = num + 1;
			Thread thread = new ThreadVetor(vetor, num);
			thread.start();
		}
		
	}

}
