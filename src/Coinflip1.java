import java.util.Scanner;
import java.util.Random;

public class Coinflip1 

{

	public static void main(String[] args) 
	
	{
		
		String coinSelection = null; //Variable for user input of heads or tails
		String playAgain = null;//Variable for wanting to play again or not
		String yes = "yes";//String yes is used for determining if the program continues
		String no = "no";//String no is used for determining if the program ends
		boolean play = true;//Boolean play is set to true. If false, program ends
		
		//Sets up the heads and tails Strings for the random
		String[] headsTails = new String[2];
		headsTails[0] = ("heads");
		headsTails[1] = ("tails");
		
		do
		{	
			//User chooses heads or tails and creates coinSelectionLower which takes the user input and makes it lower case
			Scanner input = new Scanner(System.in);
			System.out.println("Hello!");
			System.out.println("Enter heads or tails: ");
			coinSelection = input.nextLine();
			String coinSelectionLower = coinSelection.toLowerCase();
			
			//If user doesn't input heads or tails, display a message
			if (!coinSelectionLower.equals("heads")&!coinSelectionLower.equals("tails"))
			{
				System.out.println("Invalid input");
				System.out.println();
				continue;
			}
		
			//Randomly picks from the headsTails array and display's it
			Random rand = new Random();
			String coin = headsTails[rand.nextInt(headsTails.length)];
			System.out.println("The coin lands on: " + coin);
			
			
			//Display's a message if coinSelectionLower and headsTails are equal
			if (coinSelectionLower.equalsIgnoreCase(coin))
				System.out.println("Congrats! You guessed correctly!");
			
			
			//Setting up for asking if they want to play again. If yes, loop back to beginning
			System.out.println("Would you like to play again? Enter yes or no: ");
			playAgain = input.nextLine();
			
			
			//Takes the playAgain String from above and, if it is equals to String no, it exits the program
			if (no.equalsIgnoreCase(playAgain))
				return;
			else if (!playAgain.equalsIgnoreCase(yes))
			{
				System.out.println("Invalid input. Exiting program.");
				System.exit(0);
			}	
		}
		
		while (play = true);
				
	}

}
