import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		System.out.println("Ievadiet skaitli: ");
		Scanner scanner = new Scanner(System.in);

		int to = scanner.nextInt();

		if (to >= 0) {
			for (int i = 0; i <= to; i++) {
				System.out.print("" + i + ",");
			}
		}

		scanner.close();

	}

}
