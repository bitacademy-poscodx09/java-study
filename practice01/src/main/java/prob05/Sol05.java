package prob05;

public class Sol05 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(i);
			// System.out.print(i + "\n");

			String number = String.valueOf(i);

			System.out.print(" ");
			System.out.print(number.length());
			System.out.print("\n");
		}
	}
}
