package paint;

public abstract class Shape implements Drawable {
	private Point[] points;
	private String lineColor;
	private String fillColor;
	
	public abstract void draw();
}