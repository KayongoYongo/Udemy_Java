import java.util.Random;

public class RandomNumber{
	public static void main(String[] args){
		Random rand = new Random();

		int min = -10;
        	int max = 10;

		// (max - min + 1) gives total numbers in range
                int randomInt = rand.nextInt(max - min + 1) + min;
		
		if(randomInt < 0)
		{
			System.out.println(randomInt + " " + "is negative");
		}
		else if(randomInt > 0)
		{
			System.out.println(randomInt + " " +  "is positive");
		}
		else
		{
			System.out.println(randomInt + " " + "is Zero.");
		}
	}
}	
