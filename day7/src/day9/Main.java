package day9;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		int mode = 0;//menu ��� ��� �ϱ� ���� �Է� ���� ��
		student1 [] std = new student1[30]; //������ �л����� �迭 ������ ����
		int cnt = 0; // ���� ���� �߰��� �л��� ��
		Scanner scan = new Scanner(System.in);
				do {     //�ѹ� �̻� ������ �����ؾ��ϹǷ� do while ���� ����� ���� ��ư ������������ ��� ����
					menu();
					mode = scan.nextInt(); //�Է¹��� ���� mod ������ �־��ش�.
					
					
					switch(mode) {
					
					case 1 :  //�л����� �߰�
						
						
						System.out.println("�л� �̸��� �Է� : ");
						String name= scan.next();   //�����̳� ���� �������� �ν�, nextline�� ��ü �� �ν�
						System.out.println("�л� �г��� �Է� : ");
						int grade= scan.nextInt();
						System.out.println("�л� �й��� �Է� : ");
						int classNumber= scan.nextInt();
						System.out.println("�л� ��ȣ�� �Է� : ");
						int number= scan.nextInt();
						System.out.println("�л� ������ �Է� : ");
						int kor= scan.nextInt();
						System.out.println("�л� ������ �Է� : ");
						int eng= scan.nextInt();
						System.out.println("�л� ������ �Է� : ");
						int math= scan.nextInt();
						
						
						std[cnt++] = new student1(name,grade,classNumber, number, kor, eng, math);
						break;
					case 2 :  //�л����� ����
						System.out.println("�ٲ� �л��� �г� �� ��ȣ �̸��� �����ÿ�");
						
						System.out.println("�л� �г��� �Է� : ");
						int searchgrade= scan.nextInt();
						System.out.println("�л� �й��� �Է� : ");
						int serarchclassNumber= scan.nextInt();
						System.out.println("�л� ��ȣ�� �Է� : ");
						int searchnumber= scan.nextInt();
						// ���� ��
						
						for(int i =0; i<cnt; i++) {
							if(std[i].compareTo(searchgrade, serarchclassNumber,searchnumber)) {
								
								
								System.out.println("������ �л� �̸� : ");
								String modifyName = scan.next();
								System.out.println("������ �л� ���� : ");
								int modifykor = scan.nextInt();
								System.out.println("������ �л� ���� : ");
								int modifyeng = scan.nextInt();
								System.out.println("������ �л� ���� : ");
								int modfimath = scan.nextInt();
								// ������ ��
								
								std[i].setName(modifyName); //�ش��ϴ� ������ ���� �� �� ���Ƿ� set���� �� �� name�� ���� modfyname�� ������ �ٲ۴ٴ� ����
								std[i].setEng(modifyeng);
								std[i].setMath(modfimath);
								std[i].setKor(modifykor);
								
								//����
							}
							
						}
							
						
						break;
					case 3 : //�л� ���� ���
						for(int i=0; i<cnt; i++) {
						std[i].printInfo();
						
						//for(Student s : std){ if(s !=null)s.printInfo(); ���� for���� ���� for��
							
						}
						
						break;
					case 4 : //����
						System.out.println("����");
					break;
					default :
						System.out.println("���� �����Դϴ�.");
					}
				}
				
				while(mode !=4);
				scan.close();
	}
	public static void menu() {   //static �� �ȵ��� ������� ��ü�� ����� ȣ��ȸ�ߵ�. �޴� �޼���� ��ü�� ȣ���ϴ°� �ƴ϶� �׳� �����ֱ⸸�ϴ°�
		//�ܼ��� �޴��� ��
		System.out.println("�޴�");
		System.out.println("1.�л����� �߰�");
		System.out.println("2.�л����� ����");
		
		System.out.println("3.�л� ���� ���");
		System.out.println("4.����");
		System.out.println("�޴����� �Ͻÿ�");
	}
}
