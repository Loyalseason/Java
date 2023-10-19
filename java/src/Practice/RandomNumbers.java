package Practice;
import java.util.Scanner;

public class RandomNumbers {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Generate a random number between 1 and 100
	        int min = 1;
	        int max = 100;
	        int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
	        
	        int numberOfTries = 0;
	        int userGuess;
	        
	        System.out.println("Welcome to the Random Number Guessing Game!");
	        
	        do {
	            System.out.print("Guess the number between " + min + " and " + max + ": ");
	            userGuess = scanner.nextInt();
	            numberOfTries++;
	            
	            if (userGuess < randomNumber) {
	                System.out.println("Too low, try again.");
	            } else if (userGuess > randomNumber) {
	                System.out.println("Too high, try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + numberOfTries + " tries.");
	            }
	            
	        } while (userGuess != randomNumber);
	        
	        scanner.close();
	    }
}





