package javaday5.shape;

public class Point {

	private int x;
	private int y;
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
	public void move(int x, int y) {
		this.setX(x);
		this.setY(y);
		
	}
	public void print() {
		System.out.println("("+ x +", "+y+")");  //Æ÷ÀÎÆ®
	}
	public Point() {}
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public Point(Point p) {
		this.setX(p.x);
		this.setY(p.y);
	}
	
}
	
