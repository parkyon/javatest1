package day9;

public class Manager {
	public static final int STUDENT_MAX = 30;
	//�л� �ִ� ������ 30���� ������ ���� (final=>������ ���ȭ ��Ű�� Ű����)�� ����߱� ������
	//�߰��� ���� ���� �� �� ���� �Ѵ�.
	private student1 []std; 
	private int cnt = 0; //���� ����� �л� ��
	public Manager() {
		std = new student1[STUDENT_MAX];
	}
	
	public void addStudent(String name, int grade, int classNumber, int number, int kor, int eng, int math) {
		std[cnt] = new student1(name,grade,classNumber, number, kor, eng, math);
		cnt++;
		
		
	}
	public void printStudent() {
		for(student1 s:std) {
			if(s !=null) {
				s.printInfo();
			}
		}
	}
	public boolean modifyStudent(int searchgrade, int serarchclassNumber,int searchnumber, String modifyName,int modifyeng, int modfimath, int modifykor ) {
		for(int i =0; i<cnt; i++) {
			if(std[i].compareTo(searchgrade, serarchclassNumber,searchnumber)) {
				std[i].setName(modifyName); //�ش��ϴ� ������ ���� �� �� ���Ƿ� set���� �� �� name�� ���� modfyname�� ������ �ٲ۴ٴ� ����
				std[i].setEng(modifyeng);
				std[i].setMath(modfimath);
				std[i].setKor(modifykor);
				return true;
				//����
			}
			
		}return false;
	}
}
