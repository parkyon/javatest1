package day9;

public class Manager {
	public static final int STUDENT_MAX = 30;
	//학생 최대 정보는 30개로 무조건 고정 (final=>변수를 상수화 시키는 키워드)을 사용했기 때문에
	//중간에 값을 변경 할 수 없게 한다.
	private student1 []std; 
	private int cnt = 0; //현재 저장된 학생 수
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
				std[i].setName(modifyName); //해당하는 변수에 직접 갈 수 없므로 set으로 함 즉 name의 값을 modfyname의 값으로 바꾼다는 것임
				std[i].setEng(modifyeng);
				std[i].setMath(modfimath);
				std[i].setKor(modifykor);
				return true;
				//지정
			}
			
		}return false;
	}
}
