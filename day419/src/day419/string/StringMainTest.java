package day419.string;

import java.util.Scanner;

public class StringMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =new String("Hello world");
		System.out.println(s.charAt(0));
		/*Scanner scan = new Scanner(System.in);
		char op = scan.next().charAt(0);*/
		s = s + "!";
		System.out.println(s);
		System.out.println(s.contains("Hello")); // Hello가 있으면 TRUe 없으면 False 해당하는 묹열이 있는지 확인
		s = "Hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith(".txt")); // 해당하는 문자열로 끝나는지 확인을 한다.확장자 검색할때 사용
		System.out.println(s.equals("Hello.txt")); //해당하는 문자열의 값ㅇ르 비교
		System.out.println(s.indexOf('l'));
		System.out.println(s.indexOf('a'));
		int [] arr = new int[4];
				int a = s.length();
				s= "www.naver.com";
	String []sp = s.split("a");
	for(int i = 0; i<sp.length; i++) {
		System.out.println(sp[i]);
	}
	s = "Hello";
	System.out.println(s.substring(0, 2)); //0 부터 2번지 미만자리 수 까지 짜른다	
	
	s = String.valueOf(100);
	s = String.valueOf('a');
	A a1 = new A();
	s = String.valueOf(a1);
	
	System.out.println(a1);
	
	StringBuffer sb = new StringBuffer("012345");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	//System.out.println(sb.delete(0, 2));
	//2345
	//System.out.println(sb.insert(4, "a")); //4번지 다음에 문자열 a를 넣겠다
	
	System.out.println(sb.reverse());
	
	
	}

	

}
class A{}
