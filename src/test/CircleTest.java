package test;

import java.util.*;

class Circle{
	private int radius;


	public Circle() {
		this.radius = 1;
	}

	public Circle(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}



	@Override
	public int hashCode() {
		int result = 1;
		result = result + radius;
		return result;
	}

	
	public boolean equals(Circle circle) {

		if(this.radius == circle.radius)
			return true;
		else 
			return false;

	}

	
	@Override
	public String toString() {
		return "Circle [area()=" + area() + "]";
	}

}



public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab1_5 : ¿ëµ¿Áß");

		Random rand = new Random();
		Circle circle1 = new Circle();
		circle1.setRadius(2);


		Circle circle2 = new Circle(rand.nextInt(4)+1);


		System.out.println(circle1);
		System.out.println(circle2);

		System.out.println(circle1.equals(circle2));

		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());

		System.out.println(circle1.area());
		System.out.println(circle2.area());


	}

}
