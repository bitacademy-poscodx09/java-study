package prob03;

public class CurrencyConverterTest {
	public static void main(String[] args) {
		//  환율 세팅
		CurrencyConverter.setRate(1380.0);
		
		double dollar = CurrencyConverter.toDollar(1000000.);
		System.out.println("백만원은 " + dollar + "달러 입니다");
		
		double krw = CurrencyConverter.toKRW(100.);
		System.out.println("백달러는 " + krw + "원 입니다");
	}
}