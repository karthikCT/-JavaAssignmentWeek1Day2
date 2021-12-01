package week1.day2;

public class Calculator {

	public int add(int num1, int num2) {
		return num1+num2 ;
		
	}
	
	public double sub(double num1, double num2) {
		return num1-num2;

	}
	
	public double mul(double num1, double num2) {
		return num1*num2;

	}
	
	public int div(int num1, int num2) {
		return num1/num2;
		

	}
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("Addition "+ cal.add(1, 2));
        System.out.println("Subraction " +cal.sub(2.5, 1.8));
        System.out.println("Multiplication: " + cal.mul(2.2, 2.7));
        System.out.println("Division: " +cal.div(4, 2));
	}

}
