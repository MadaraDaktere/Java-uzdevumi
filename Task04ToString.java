import java.util.Scanner;

public class Task04ToString {

	public static void main(String[] args) {
		System.out.println("Ievadiet tekstu: ");
		Scanner scanner = new Scanner(System.in);

		String str1 = scanner.nextLine();
		System.out.println("Ievadiet otru tekstu: ");
		String str2 = scanner.nextLine();

		if (str1.length() <= str2.length()) {
			System.out.println(str1 + str2 + str1);
		} else {
			System.out.println(str2 + str1 + str2);
		}

		scanner.close();

	}

}
