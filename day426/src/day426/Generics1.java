package day426;

public class Generics1 {
	public static void main(String[] ars) {
		GenericEx<Integer> ge = new GenericEx();
		ge.data = 10;
		System.out.println(ge);
	}
}
class GenericEx <T>{             //<T>���� Ŭ������ ����Ex) Integer
	T data;
	public GenericEx() {}
	
	public String toString() {
		return this.getClass().getName()+":Generic Ŭ����:. ";
	}
	
}
