package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point point = new Point();
		
		Class klass = point.getClass();			// reflection
		System.out.println(klass);
		
		System.out.println(point.hashCode());	// address 기반의 해싱값
												// address x
												// reference 값 x
		
		System.out.println(point.toString());	// getClass().toString() + "@" + hashCode()
		System.out.println(point);
	}

}
