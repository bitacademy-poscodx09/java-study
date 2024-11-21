package prob02;

import java.util.Scanner;

public class GoodsTest {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();

			String[] tokens = line.split(" ");
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int countStock = Integer.parseInt(tokens[2]);

			Goods g = new Goods();
			g.setName(name);
			g.setPrice(price);
			g.setCountStock(countStock);

			goods[i] = g;
		}

		for (Goods g : goods) {
			g.printInfo();
		}

		scanner.close();
	}
}
