package Figure;

public class Main {
	
	public Main(int x, int y, int w, int h) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
	Rect r = new Rect();
	r.draw();
	Rect r2 = new Rect(1,2,3,4);
	r2.draw();
	Shape s = new Shape();	
	
	if(r instanceof Shape) //(shape)r 이 가능한가를 물어봄 즉 형변환이 가능한지를 물어보는거
//	if(s instanceof Rect) 이건 안됨		
		
		System.out.println("OK");
	else
		System.out.println("fail");
		
		}
}
/*Rect  (형변환)-> shape
 *        <!-(형변환)
 * 
 * Shape  (생성)-> Rect (형변환)-> Rect 
 */








class Shape{
	
	private	int x;
	private	int y;
	private	int w;
	private	int h;
	
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
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}

	
	public void draw() {
		System.out.println("도형");
	}
	
	
	public void move(int x, int y) {
		
		this.x= x;  //this.setX(x);
		this.y =y; //this.setY(Y);
	}
	
	public void resize(int w, int h) {
		this.w= w;
		this.h= h;
	}
	public Shape() {}
	public Shape(int x, int y, int w, int h) {  
		this.move(x, y);
		this.resize(w, h);
	}
}

