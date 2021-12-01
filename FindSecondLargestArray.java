package week1.day2;

import java.util.Arrays;

public class FindSecondLargestArray {

	public static void main(String[] args) {
		int[] data = {4,2,6,8,9,2};
		Arrays.sort(data);
		int SecondLargestArray = data.length-2;
		System.out.println(data[SecondLargestArray]);

	}

}
