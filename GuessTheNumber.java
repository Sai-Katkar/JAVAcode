import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static final int MAX = 100;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Random r = new Random();
		
		int secretNumber = r.nextInt(MAX);   // 0 to 99
		
		System.out.println("I will pick a number between 0 sand 99. Can you guess the number. ");
		
		boolean correctGuess = false;
		while(correctGuess == false)
		{
		System.out.println("Enter your guess:");
		
		
		int guess = key.nextInt();
		
		
		
		

			if(guess < 0 || guess > 99 );
			{
			System.out.println("Invalid value entered!");
			System.exit(0);
			}
		
		
			if (guess > secretNumber)
			{
				System.out.println("Your guess is too high! Pick a smaller value!");
			
			}
			else if (guess< secretNumber)
			{
				System.out.println("Your guess is too high! Pick a larger value!");
			
			}
			else {
				System.out.println("Your guess is correct!!!");
				correctGuess= true;
				
			}
			
		}
		
		

	}

}
