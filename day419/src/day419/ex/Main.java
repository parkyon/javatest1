package day419.ex;

import java.util.Scanner;

public class Main {

	//Ȯ���� ������ �������� �ƴ��� Ȯ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String s = scan.next();
		
		
		
	//	System.out.println(s.endsWith(".avi") || s.endsWith("mp4") || s.endsWith(".wmv"));
		
		if(s.endsWith(".avi") || s.endsWith("mp4") || s.endsWith(".wmv")) 
		{
			System.out.println("������ ������");
		}
		else
		{
			System.out.println("������ ���� �ƴ�");
		}
		
		
	}

}
