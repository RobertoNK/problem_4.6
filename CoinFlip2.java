import java.util.Scanner;

public class CoinFlip2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean headsWasSelected = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter heads or tails");
		String userInput = input.nextLine();
		while(true) {
		
			if(userInput.equalsIgnoreCase("heads")) {
				headsWasSelected = true;
				break;
	
			}else if(userInput.equalsIgnoreCase("tails")){
				headsWasSelected =false;
				break;
			}
			
			else {
				System.out.println("Re-enter heads or tails: ");
				userInput = input.nextLine();
				
			}
		}
		// Choose random number
		double randomNumber = Math.random();
		
		boolean randomOutcome=false;
		if(randomNumber < 0.5) {
			randomOutcome = true;
		}else {
			randomOutcome = false;
		}
		// Determine whether user guessed correctly
		
		if(headsWasSelected && (randomOutcome)) {
			System.out.println("You win!");
		}else if(!headsWasSelected && (randomOutcome)) {
			System.out.println("You win!");
		}else {
			System.out.println("Sorry, you losose");
		}
		
	}

}
