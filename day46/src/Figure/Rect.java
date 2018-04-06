package Figure;



public class Rect extends Shape {
	
	
	public Rect() {
		super();
		
	}
	
	public Rect(int x, int y, int w, int h) {
		super(x,y,w,h);
	}
	
	@Override
	public void draw() {
		System.out.println("사각형입니다.");
		System.out.println("왼쪽 위의 점: "+getX()+"," + getY());
		System.out.println("가로 : " + getW());
		System.out.println("세로 : " + getY());
	}

}