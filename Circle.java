package com.lxy;

public class Circle {
	int r;
	Circle( int r) {
	this.r=r;
	}
	
	public double getArea() {
		System.out.println("The area:");
		return Math.PI*r*r;
		
	}
	
	public double getPerimeter() {
		System.out.println("The perimeter:");
		return  2*Math.PI*r;
		
	}
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		
	}
	

}
