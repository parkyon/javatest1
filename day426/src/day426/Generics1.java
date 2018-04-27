package day426;

public class Generics1 {
	public static void main(String[] ars) {
		GenericEx<Integer> ge = new GenericEx();
		ge.data = 10;
		System.out.println(ge);
	}
}
class GenericEx <T>{             //<T>에는 클래스가 들어간다Ex) Integer
	T data;
	public GenericEx() {}
	
	public String toString() {
		return this.getClass().getName()+":Generic 클래스:. ";
	}
	
}
