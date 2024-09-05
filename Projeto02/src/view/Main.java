package view;

import controller.SomaController;

public class Main {
	
	public static void main(String[] args) {
		int[][] matriz = new int [3][5];
		int i = 0;
		int j = 0;
		int num = 0;
		
		for (i = 0 ; i < 3 ; i ++) {
			for (j = 0 ; j < 5 ; j ++) {
				matriz[i][j] = num = (int)((Math.random() * 10) + 1);
			}
		}
		
		int[] vetor = new int [5];
		
		for (i = 0 ; i < 3 ; i ++) {
			vetor = matriz[i];
			Thread thread =  new SomaController(vetor, i);
			thread.start();
		}
	}
}
