package prob03;

public class Sol03 {
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("수를 입력 하세요 : ");

			int number = scanner.nextInt();
			int sum = 0;

			for(int i = 0; i <= number; i++) {
				if(number % 2 == 0 && i % 2 == 0 || number % 2 != 0 && i % 2 != 0) {
					sum += i;
				}
			}

			System.out.println("결과값: " + sum);
		}
	}
}
