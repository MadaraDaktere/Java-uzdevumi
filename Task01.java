import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		System.out.println("Ievadiet pirmo skaitli: ");
		Scanner scanner = new Scanner(System.in);
		int int1 = scanner.nextInt();

		System.out.println("Ievadiet otro skaitli: ");
		int int2 = scanner.nextInt();

		System.out.println("The sum is = " + (int1 + int2));

		scanner.close();

	}

}
