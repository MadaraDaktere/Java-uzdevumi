import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		System.out.println("Ievadiet skaitli: ");
		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();
		System.out.println("Ievadiet otru skaitli: ");
		int d = scanner.nextInt();
		System.out.println("Ievadiet treso skaitli: ");
		int e = scanner.nextInt();
		
		if(c != d && d != e && c != e) {
			System.out.println("Skaitlu summa ir: " + (c + d + e));
		} else if (c == e && d != e) {
			System.out.println("Skaitlu c un d summa ir: " + (c + d));
		} else if (c == d && d != e) {
			System.out.println("Skaitlu c un e summa ir: " + (c + e));
		} else if (c == e && e != d) {
			System.out.println("Skaitlu d un e summa ir: " + (d + e));
		}
		else {
			System.out.println("Visi skaitli ir vienadi, rezultats ir 0");
		}
		
		
		
		
		scanner.close();

	}


}
