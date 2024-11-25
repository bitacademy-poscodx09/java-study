package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		// 직접 생성하면 heap상에 객체가 존재하게 된다.
		// 리터럴(literal)을 사용하면 JVM안의 Constant Pool에서 관리하게 된다. 
		Integer i = new Integer(10);
		Character c= new Character('c');
		Boolean b = new Boolean(true);

		// auto boxing
		Integer j1 = 10;
		Integer j2 = 20;
		
		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
		// auto unboxing
		int m = j1 + 10;
		// int m = j1.intValue() + 10;
	}
}