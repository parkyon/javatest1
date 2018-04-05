package day9;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		int mode = 0;//menu 기능 어떤걸 하기 위해 입력 받을 값
		student1 [] std = new student1[30]; //관리할 학생들의 배열 갯수만 정의
		int cnt = 0; // 현재 까지 추가된 학생의 수
		Scanner scan = new Scanner(System.in);
				do {     //한번 이상 무조건 실행해야하므로 do while 문을 사용함 졸요 버튼 누르기전에는 계속 실행
					menu();
					mode = scan.nextInt(); //입력받은 값을 mod 변수에 넣어준다.
					
					
					switch(mode) {
					
					case 1 :  //학생정보 추가
						
						
						System.out.println("학생 이름을 입력 : ");
						String name= scan.next();   //공백이나 엔터 전까지만 인식, nextline은 전체 다 인식
						System.out.println("학생 학년을 입력 : ");
						int grade= scan.nextInt();
						System.out.println("학생 학반을 입력 : ");
						int classNumber= scan.nextInt();
						System.out.println("학생 번호을 입력 : ");
						int number= scan.nextInt();
						System.out.println("학생 국어을 입력 : ");
						int kor= scan.nextInt();
						System.out.println("학생 영어을 입력 : ");
						int eng= scan.nextInt();
						System.out.println("학생 수학을 입력 : ");
						int math= scan.nextInt();
						
						
						std[cnt++] = new student1(name,grade,classNumber, number, kor, eng, math);
						break;
					case 2 :  //학생정보 수정
						System.out.println("바꿀 학생의 학년 반 번호 이름을 적으시오");
						
						System.out.println("학생 학년을 입력 : ");
						int searchgrade= scan.nextInt();
						System.out.println("학생 학반을 입력 : ");
						int serarchclassNumber= scan.nextInt();
						System.out.println("학생 번호을 입력 : ");
						int searchnumber= scan.nextInt();
						// 원래 값
						
						for(int i =0; i<cnt; i++) {
							if(std[i].compareTo(searchgrade, serarchclassNumber,searchnumber)) {
								
								
								System.out.println("수정할 학생 이름 : ");
								String modifyName = scan.next();
								System.out.println("수정할 학생 국어 : ");
								int modifykor = scan.nextInt();
								System.out.println("수정할 학생 영어 : ");
								int modifyeng = scan.nextInt();
								System.out.println("수정할 학생 수학 : ");
								int modfimath = scan.nextInt();
								// 수정할 값
								
								std[i].setName(modifyName); //해당하는 변수에 직접 갈 수 없므로 set으로 함 즉 name의 값을 modfyname의 값으로 바꾼다는 것임
								std[i].setEng(modifyeng);
								std[i].setMath(modfimath);
								std[i].setKor(modifykor);
								
								//지정
							}
							
						}
							
						
						break;
					case 3 : //학생 정보 출력
						for(int i=0; i<cnt; i++) {
						std[i].printInfo();
						
						//for(Student s : std){ if(s !=null)s.printInfo(); 위의 for문의 향상된 for문
							
						}
						
						break;
					case 4 : //종료
						System.out.println("종료");
					break;
					default :
						System.out.println("없는 메유입니다.");
					}
				}
				
				while(mode !=4);
				scan.close();
	}
	public static void menu() {   //static 가 안들어가면 만들어진 객체를 만들어 호출회야됨. 메뉴 메서드는 객체를 호출하는게 아니라 그냥 보여주기만하는거
		//단순히 메뉴만 찍어냄
		System.out.println("메뉴");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		
		System.out.println("3.학생 정보 출력");
		System.out.println("4.종료");
		System.out.println("메뉴선택 하시오");
	}
}
