package calculater;

import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		calculater result = new calculater();
		int big = 0;
		int small = 0;
		int mod = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ū ���� �Է��Ͻÿ�");
		big = scan.nextInt();
		System.out.println("���� ���� �Է��Ͻÿ�");
		small = scan.nextInt();
		
				
		
	
		System.out.println("�޴�");
		System.out.println("1.���ϱ�");
		System.out.println("2.����");
		System.out.println("3.���ϱ�");
		System.out.println("4.������");
		System.out.println("5.������");
		System.out.println("6.����");
		
		mod = scan.nextInt();
		switch(mod) {
		
		case 1 :
		System.out.println("="+result.sum(big, small));
		break;
		case 2 :
		System.out.println("="+result.bbagi(big, small));
		break;
		case 3 : 
		System.out.println("="+result.gob(big, small));
		break;
		case 4 :
		System.out.println("="+result.nanugi(big, small));
		break;
		case 5 :
		System.out.println("="+result.mod(big, small));
		break;
		case 6 :
			System.out.println("����");
			break;
		default :
			System.out.println("�߸��� �޴�");
		}
		
	
		
}
	
		

	
}