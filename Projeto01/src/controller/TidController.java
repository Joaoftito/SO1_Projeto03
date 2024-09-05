package controller;

public class TidController extends Thread {

	public TidController() {
		super();
	}

	@Override
	public void run() {
		int tid = (int) threadId();
		System.out.println("#" + tid);
	}

}
