package com.poscodx.paint.shape;

import com.poscodx.paint.i.Drawable;
import com.poscodx.paint.point.Point;

public abstract class Shape implements Drawable {
	private Point[] points;
	private String lineColor;
	private String fillColor;
	
	public abstract void draw();
}