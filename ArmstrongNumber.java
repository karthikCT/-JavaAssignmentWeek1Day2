package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int remainder;
		int original=0;
		int sum = 0;
		input = original;
		
		while (input > 0) {
			remainder= input % 10;
			input = input/10;
			 sum = sum + (remainder*remainder*remainder);
			
						
		}
		if (original == sum)
		{
			System.out.println("The Number is Armstrong number");   
		}
		else 
			System.out.println("It is not armstrong number");  
	}

}
