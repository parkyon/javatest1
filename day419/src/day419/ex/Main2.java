package day419.ex;

import java.util.Scanner;
import java.util.Vector;

public class Main2 {
//문장이 몇개인지 알수있는거 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String[] arr = s.split("\\.");
		System.out.println(arr.length);
		
		//다른방법
	/*	int cnt = 0;
		int next = 0;
		while(s.indexOf('.',0) != -1) {
			cnt++;
			next = s.indexOf('.', next)+1;
		}
		System.out.println(cnt);
			
		}
		*/
	   	
	
		
		
		
		
		
	}

}


