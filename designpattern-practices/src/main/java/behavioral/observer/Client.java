package behavioral.observer;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Subject<Integer> intSubject = new Subject<>();
		
		intSubject.registerObserver(new Observer<Integer>() {
			@Override
			public void update(Integer val) {
				System.out.println("Observer01: " + val);
			}
			
		});
		
		intSubject.registerObserver(val -> System.out.println("Observer02: " + val));

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			Integer val = scanner.nextInt();
			intSubject.changeSubject(val);
		}
	}
}
