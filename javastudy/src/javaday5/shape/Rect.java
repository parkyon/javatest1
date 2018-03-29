package javaday5.shape;

public class Rect {
	private Point leftUp;
	private Point rightDown;
	private int width;
	private int height;
	
	public Point getleftUp() {
		return leftUp;
	}
	public void setleftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getrightDown() {
		return rightDown;
	}
	public void setrightDown(Point rightDown) {
		this.rightDown = rightDown;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	
	private void calWidth() {
		width = (rightDown.getX() - leftUp.getX());
	}
	private void calHeight() {
		height = Math.abs(rightDown.getY()-leftUp.getY());
	}
	public Rect(){
		this.leftUp = new Point(0, 10);
		this.rightDown = new Point(10, 0);
		this.calWidth();
		this.calHeight();
	}
	public Rect(int left,int up, int right, int down) {
		this.leftUp = new Point(left, up);
		this.rightDown = new Point(right,down);
		this.calHeight();
		this.calWidth();
	}
	
	public Rect(Point leftUp, Point rightDown) {
		this.leftUp = new Point(leftUp);
		this.rightDown = new Point(rightDown);
		this.calHeight();
		this.calWidth();
	}
	public void print() {
		System.out.println("�簢���� ����");
		System.out.print("�»��� ��:");
		leftUp.print();
		System.out.print("������ �� :");
		rightDown.print();
		System.out.println("���� :" + width);
		System.out.println("���� :" + height);
	}
}

