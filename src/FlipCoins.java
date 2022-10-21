import java.util.Scanner;
import java.util.Random;

public class FlipCoins {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount;
		int randomNumber;
		int heads = 0;
		int tails = 0;
		int percentage;

		Scanner input = new Scanner(System.in);
		System.out.print("Guess which will have more: heads or tails? ");
		headsOrTailsGuess = input.nextLine().toLowerCase();

		Scanner newInput = new Scanner(System.in);
		System.out.print("How many times shall we flip a coin? ");
		String userInput = newInput.nextLine();
		numberOfFlips = Integer.parseInt(userInput);

		for (int i = 0; i < numberOfFlips; i++) {
			Random randomNum = new Random();
			randomNumber = 0 + randomNum.nextInt(2);
			if (randomNumber == 0) {
				heads++;
				System.out.println("heads");
			} else {
				tails++;
				System.out.println("tails");
			}
		}

		if (headsOrTailsGuess.equals("heads"))
			correctCount = heads;
		else {
			correctCount = tails;
		}

		percentage = (correctCount * 100) / numberOfFlips;
		System.out.println("\nYour guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		System.out.println("That's " + percentage + "%.");
	}
}
