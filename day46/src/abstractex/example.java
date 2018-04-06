package abstractex;

public class example {

public static void main(String[] args) {
	
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
}	


}

}

interface C{
	public abstract void TesT();

interface ShapeInterface{    //->인터페이스 
public abstract void draw();
public abstract void resize(int w, int h);
public abstract void move(int x, int y);
}
class shape implements ShapeInterface,C{

@Override
public void draw() {
	// TODO Auto-generated method stub
	
}

@Override
public void resize(int w, int h) {
	
	// TODO Auto-generated method stub
	
}

@Override
public void move(int x, int y) {
	// TODO Auto-generated method stub
	
	}

@Override
public void TesT() {
	// TODO Auto-generated method stub
	
}
}
}

