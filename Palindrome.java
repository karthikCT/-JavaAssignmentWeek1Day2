package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String word = "malayalaM";
		char[] check = word.toCharArray();
		String rev = "";
		int c = word.length();

		for (int i = c; i > 0; i--) {
			rev = rev + check[i - 1];
		}

		System.out.println("Original word is : " + word);
		System.out.println("Reverse word is : " + rev);

		if (word.equalsIgnoreCase(rev)) {
			System.out.println("The given word IS a palindrome");
		} else {
			System.out.println("The given word IS NOT a palindrome");
		}

	}

}
