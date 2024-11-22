package exception;

@SuppressWarnings("serial")
public class MyException extends Exception {
	public MyException() {
		super("MyException Thrown");
	}

	public MyException(String message) {
		super(message);
	}
}
