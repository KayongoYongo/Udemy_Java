import java.util.*;

public class findMaxValueInArray{
	public static void main(String[] args) {
		// Declare an array of integers
		int[] numbers = {10, 65, 41, 50};

		// Find the maximum number
		int max = 1;

		for (int i = 0; i < numbers.length ; i++){
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("The maximum number is" + " "  + max);
	}
}
		
