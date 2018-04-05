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
		Rect r3 = new Rect(new Point(0,0),   //new point�� ��ü�� �ҷ��´�. �� ���� ��� ���� �� �ʿ䰡 ����. �ѹ� ���� ���������� �̷�������� ����.
					new Point(10, -10));
		r3.print();
		r3.move(3, -3);
		System.out.println("x�������� 3 y�������� -3��ŭ �̵�");
		r3.print();
		r3.resize(5, 5);
		System.out.println("���ΰ� 5 ���ΰ� 5�� ����");
		r3.print();
		
	}
}