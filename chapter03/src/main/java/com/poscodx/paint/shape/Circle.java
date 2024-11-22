package com.poscodx.paint.shape;

public class Circle extends Shape {
	private int radius;
	
	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
}
