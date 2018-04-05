package javaday5.shape;

public class Rect {
	protected Point leftUp;
	protected Point rightDown;
	protected int width;
	protected int height;
	
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

	
	protected void calWidth() {
		width = (rightDown.getX() - leftUp.getX());
	}
	protected void calHeight() {
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
		System.out.println("사각형의 정보");
		System.out.print("좌상의 점:");
		leftUp.print();
		System.out.print("우하의 점 :");
		rightDown.print();
		
		System.out.println("가로 :" + width);
		System.out.println("세로 :" + height);
	
		
	}
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
		this.rightDown.move(this.leftUp.getX()+width,
							this.leftUp.getY()-height);
		
		
		
	}
	public void move(int x, int y) {
		this.leftUp.move(this.leftUp.getX()+x,this.leftUp.getY()+y);
		
		this.rightDown.move(this.rightDown.getX()+x, this.rightDown.getY()+y);
		
	}
}

