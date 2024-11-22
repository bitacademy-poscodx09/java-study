package paint;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("Point[x=" + x + ", y="+ y +"]를 그렸습니다.");
	}

	public void show(boolean visible) {
		if(visible) {
			show();
		} else {
			System.out.println("Point[x=" + x + ", y="+ y +"]를 지웠습니다.");
		}
	}

	@Override
	public void draw() {
		show();
	}
}
