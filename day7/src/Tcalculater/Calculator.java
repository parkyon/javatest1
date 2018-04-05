package Tcalculater;

public class Calculator {


	private double num1;
	private double num2;
	private char operator;
	private double result;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

	public void setCal(double num1, double num2, char operator) {  //재설정을 위한 거
		this.setNum1(num1);
		this.setNum2(num2);
		this.setOperator(operator);
		
	}
	public Calculator() {}
	public Calculator(double num1, double num2, char operator) {
		this.setCal(num1, num2, operator);
	}
	
	public void sum() { //매개변수가 필요한 이유는 내가 알지 못하기 때문에 알고 있으면 선언 할 필요가 없다.
		result = num1 + num2;
	}
	public void sub( ) {
		result = num1 - num2;
	}
	public void mul() {
		result = num1 * num2;
	}
	public void mod() {
		result = num1 % num2;
	}
	public boolean div() {
		if(num2 == 0)
			return false;
		else {
			result = num1 / num2;
			return true;
		}
	}
	public boolean cal() {
		switch(operator) {
		case '+':
			sum();
			return true;  //적어도 됨 위에 boolean  /break; 적오됨
		case '-' :
			sub();
			return true;
		case '*' :
			mul();
			return true;
		case '/' :
			if(div())
				break;
			else return false;
			
		case '%' :
			mod();
			return true;
		default:
			return false;
		}
		return true;
	}
	
}


