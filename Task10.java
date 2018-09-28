import java.util.Random;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("I have chosen number between 1 and 10, try to guess it.");
		System.out.println("What's your number?");
		Random rndNumber = new Random();
		int randomInt = rndNumber.nextInt(10) + 1;

		int guess = scanner.nextInt();

		while (guess != randomInt) {
			System.out.println("Nop, try again.");
			guess = scanner.nextInt();
		}

		System.out.println("Correct, the number was " + randomInt);

		scanner.close();

	}

}
