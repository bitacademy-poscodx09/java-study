package mypackage;

public class Goods2 {
	public String name;		// 모든 접근이 가능하다(접근 제한이 없다)
	protected int price;	// 같은 패키지 + 자식 클래스 접근이 가능
	private int countSold;	// 클래스 내부에사만 잡근이 가능
	int countStock;			// 같은 패키지에서만(default)
	
	public void m() {
		// private은 내부에서만 접근이 가능하다.
		countSold = 10;
	}
}
