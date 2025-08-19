import java.util.*;

public class kidsWithCandies{
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		// Pseudocode
        	// Iterate through list.
        	// Compare the sum of the element throught index[i] vs the max value
        	// If the sum is equal to or greater than, append the boolean value 'True' to the list, otherwise, append false
        	// Return the array as the result

		int max = 1;

		for(int i = 0; i < candies.length ; i++)
		{
			if(candies[i] > max)
			{
				max = candies[i];
			}
		}

		// Create an empty list for boolean values
		List<Boolean> result = new ArrayList<>();

		// Iterate then find the maximum value
		for(int j = 0; j < candies.length ; j++)
		{
			if(candies[j] + extraCandies >= max)
			{
				result.add(true);
			} else {
				result.add(false);
			}	
		}

		return result;
	}
	    // Main method for testing
    	public static void main(String[] args) {
        	kidsWithCandies solver = new kidsWithCandies();
        	int[] candies = {4, 2, 1, 1, 2};
        	int extraCandies = 1;
        	System.out.println(solver.kidsWithCandies(candies, extraCandies));
    }
}

