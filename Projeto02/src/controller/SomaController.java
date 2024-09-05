package controller;

public class SomaController extends Thread{
	
	private int[] vetor;
	private int i;
	
	public SomaController(int[] vetor, int i) {
		this.vetor = vetor;
		this.i = i;
	}
	
	@Override
	public void run() {
		soma();
	}
	
	private void soma() {
		int soma = 0;
		
		for (int cont = 0 ; cont < 5 ; cont ++) {
			soma = soma + vetor[cont];
		}
		
		i = i + 1;
		System.out.println("Linha: " + i + " = Soma: " + soma);
	}
	
}
