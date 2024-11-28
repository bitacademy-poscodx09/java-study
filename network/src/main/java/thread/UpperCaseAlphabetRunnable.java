package thread;

public class UpperCaseAlphabetRunnable extends UpperCaseAlphabet implements Runnable {
	@Override
	public void run() {
		print();
	}
}
