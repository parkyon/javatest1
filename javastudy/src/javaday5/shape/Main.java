package javaday5.shape;

public class Main {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.printCircle();
		c1.moveCenter(10, 10);
		c1.printCircle();
		c1.resize(10.1);
		c1.printCircle();
		
		Rect r = new Rect();
		r.print();
		Rect r2 = new Rect(0,0,10, -10);
		r2.print();
		Rect r3 = new Rect(new Point(0,0),   //new point의 객체만 불러온다. 즉 값을 계속 유지 할 필요가 없다. 한번 쓰고 벌릴영도는 이러방식으로 쓴다.
					new Point(10, -10));
		r3.print();
		r3.move(3, -3);
		System.out.println("x방향으로 3 y방향으로 -3만큼 이동");
		r3.print();
		r3.resize(5, 5);
		System.out.println("가로가 5 세로가 5로 변경");
		r3.print();
		
	}
}