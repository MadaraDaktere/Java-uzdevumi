import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadiet pirmo skaitli: ");
		int int1 = scanner.nextInt();
		System.out.println("Ievadiet otro skaitli: ");
		int int2 = scanner.nextInt();
		System.out.println("Ievadiet treso skaitli: ");
		double int3 = scanner.nextInt();

		System.out.println("The avarage is = " + ((int1 + int2 + int3) / 3.0));

		scanner.close();

	}

}
