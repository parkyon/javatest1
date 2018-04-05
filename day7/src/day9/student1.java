package day9;

public class student1 {

	private String name;
	private int grade;
	private int classNumber;
	
	private int number;
	private int kor;
	private int eng;
	private int math;
	
	public student1() {}
	public student1(String name, int grade, 
			int classNumber, int number) {
		this(name,grade,classNumber,number,0,0,0);
	}
	public student1(String name, int grade,
			int classNumber, int number, int kor,
			int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public boolean compareTo(student1 s) {
		/* 학년, 반, 번호가 같으면 같은 객체로 취급
		 * 비록 이름과 성적들이 다르다할지라도
		 * */
		return compareTo(s.grade, s.classNumber, s.number);
	}
	public boolean compareTo(int grade, int classNumber
			, int number) {
		if(this.grade == grade 
				&& this.classNumber == classNumber
				&& this.number == number) {
			return true;
		}
		return false;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("학반 : " + classNumber);
		System.out.println("번호 : " + number);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
	}
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public int getNumber() {
		return number;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
}






