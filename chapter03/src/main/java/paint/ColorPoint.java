package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		// setX(x);
		// setY(y);
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("Point[x=" + getX() + ", y="+ getY() + ", color=" + color + "]를 그렸습니다.");
	}

	@Override
	public void draw() {
		show();
	}
}
