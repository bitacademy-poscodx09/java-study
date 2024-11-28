package thread;

public class DigitThread extends Thread {

	@Override
	public void run() {
		for(int i = 1; i <= 9; i++) {
			System.out.print(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
