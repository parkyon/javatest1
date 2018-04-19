package day419.ex;

import java.util.Scanner;

public class Main {

	//확장자 동영상 파일인지 아닌지 확인함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		String s = scan.next();
		
		
		
	//	System.out.println(s.endsWith(".avi") || s.endsWith("mp4") || s.endsWith(".wmv"));
		
		if(s.endsWith(".avi") || s.endsWith("mp4") || s.endsWith(".wmv")) 
		{
			System.out.println("동영상 파일임");
		}
		else
		{
			System.out.println("동영상 파일 아님");
		}
		
		
	}

}
