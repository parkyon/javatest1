package abstractex;
import Figure.Rect;
import Figure.Main;
public class Main {
	public static void main(String[] args) {
		
	}
}

abstract class A{    //->추상클래스ㅡ
	public void print() {
		System.out.println("TEST");
		
	}
	public abstract void draw();
}
class B extends A{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

interface ShapeInterface{    //->인터페이스 
	public abstract void draw();
	public abstract void resize(int w, int h);
	public abstract void move(int x, int y);
}
class shape implements ShapeInterface{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int w, int h) {
		this.w =w;
		this.h=h;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;
		this.y=y;
	}
	
}