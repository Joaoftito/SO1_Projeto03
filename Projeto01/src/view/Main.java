package view;

import controller.TidController;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			TidController thread = new TidController();
			thread.start();
		}
	}

}
