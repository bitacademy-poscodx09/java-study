package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.5f;
	
	public float getDiscountPrice() {
		// protected는 자식에서 접근이 가능하다.
		return discountRate * price;
	}
}
