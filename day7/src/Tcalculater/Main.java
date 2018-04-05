package Tcalculater;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		Calculator c = new Calculator(num1, num2, op);
		if(c.cal())
			System.out.println(""+ c.getNum1() + c.getOperator() + c.getNum2() + "=" +c.getResult());
		else
				System.out.println("계산에 이상이 있습니다.");
		
		
		
		
		scan.close();
	}
}
