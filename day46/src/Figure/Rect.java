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
		System.out.println("�簢���Դϴ�.");
		System.out.println("���� ���� ��: "+getX()+"," + getY());
		System.out.println("���� : " + getW());
		System.out.println("���� : " + getY());
	}

}