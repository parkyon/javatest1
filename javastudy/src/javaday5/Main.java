package javaday5;

import javaday5.shape.Circle;

public class Main {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle();
	}
}