package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws MyException, IOException {
		System.out.println("some code1...");
		System.out.println("some code2...");
		
		if(1 - 1 == 0) {
			throw new MyException();
		}
		
		if(2 - 2 == 0) {
			throw new IOException();
		}
		
		
		System.out.println("some code3...");
		System.out.println("some code4...");
	}
}
