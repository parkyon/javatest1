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
		System.out.println(s.contains("Hello")); // Hello�� ������ TRUe ������ False �ش��ϴ� �L���� �ִ��� Ȯ��
		s = "Hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith(".txt")); // �ش��ϴ� ���ڿ��� �������� Ȯ���� �Ѵ�.Ȯ���� �˻��Ҷ� ���
		System.out.println(s.equals("Hello.txt")); //�ش��ϴ� ���ڿ��� ������ ��
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
	System.out.println(s.substring(0, 2)); //0 ���� 2���� �̸��ڸ� �� ���� ¥����	
	
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
	//System.out.println(sb.insert(4, "a")); //4���� ������ ���ڿ� a�� �ְڴ�
	
	System.out.println(sb.reverse());
	
	
	}

	

}
class A{}
