package calculater;

import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		calculater result = new calculater();
		int big = 0;
		int small = 0;
		int mod = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("큰 수를 입력하시오");
		big = scan.nextInt();
		System.out.println("작은 수를 입력하시오");
		small = scan.nextInt();
		
				
		
	
		System.out.println("메뉴");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.꼽하기");
		System.out.println("4.나누기");
		System.out.println("5.나머지");
		System.out.println("6.종료");
		
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
			System.out.println("종료");
			break;
		default :
			System.out.println("잘못된 메뉴");
		}
		
	
		
}
	
		

	
}