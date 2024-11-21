package chapter03;

public class SwapTest03 {

	public static void main(String[] args) {
		Value i = new Value(10);
		Value j = new Value(20);		
		System.out.println(i.val + ", " + j.val);
		
		swap(i, j);

		System.out.println(i.val + ", " + j.val);
	}

	private static void swap(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}

	
}
