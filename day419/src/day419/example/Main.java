package day419.example;

public class Main {
	public static void main(String[] args) {
	A a = new A(10, 20);
	A a1 = new A(10,20);
	System.out.println(a.equals(a1));
	a.hashCode(); //클래스 A의 맴버 a : 0~10000값을 가짐
	//현재 클래스 A로 생성된 객체가 10만개다. 10만개 전부 비교하는게 아니라 해쉬코드가 비슷한것끼리 모은 주소를 비
	System.out.println(a.toString());
	System.out.println(a);
	a1.a = 30;
	System.out.println(a);
		
}
	}

class A implements Cloneable{ 
	int a;
	int b;
	A(int a, int b){
		this.a= a;
		this.b= b;
	}
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof A) {    //null인지 먼저 판단을 하면 조금더 빠르게 실행된다.
			A tmp = (A)obj;
			if(this.a == tmp.a && this.b == tmp.b)   //(A)obj.a 로 할경우 .a가 우섡순위가 높아서 오류가 뜬다 그래서 ()처리를해서 obj를 벼환하고 그다음에 한다.
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return a%100;
	}
	@Override
	public String toString() {
		return this.a+":" +this.b;
		//return this.getClass().getName()+"@"+ Integer.toHexString(this.hashCode());
	}
	@Override
	public Object clone(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	}

