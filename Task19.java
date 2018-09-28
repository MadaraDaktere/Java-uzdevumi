import java.util.ArrayList;

public class Task19 {

	public static void main(String[] args) {
		ArrayList<String> stars = new ArrayList<>();
		stars.add("this");
		stars.add("is");
		stars.add("lots");
		stars.add("of");
		stars.add("fun");
		stars.add("for");
		stars.add("every");
		stars.add("Java");
		stars.add("programmer");

		System.out.println(stars);

		ArrayList<String> stars2 = new ArrayList<>();

		for (int i = 0; i < stars.size(); i++) {
			String item = stars.get(i);
			if (item.length() == 4) {
				stars2.add("****");
			}
			stars2.add(item);

		}
		System.out.println(stars2);

	}

}
