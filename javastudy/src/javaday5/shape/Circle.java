package javaday5.shape;

public class Circle {
		private int centerX;
		private int centerY;
		private double radius;
		public int getCenterX() {
			return centerX;
		}
		public void setCenterX(int centerX) {
			this.centerX = centerX;
		}
		public int getCenterY() {
			return centerY;
		}
		public void setCenterY(int centerY) {
			this.centerY = centerY;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}

		public Circle() {
			this.setCenter(0, 0);
			this.setRadius(5.0);
		}
		public Circle(int x, int y, double r) {
			this.setCenter(x,y);  //xy ют╥б
			this.setRadius(10.0);
		}
		public Circle(Circle c) {
			this.setCenter(c.centerX, c.centerY);
			this.setRadius(c.radius);
		}
		public void setCenter(int x, int y) {
			this.setCenterX(x);
			this.setCenterY(y);
		}
}
