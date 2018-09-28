import java.util.ArrayList;

public class Task18 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(5);
		al1.add(6);
		al1.add(4);
		
		

		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(2);
		al2.add(3);
		
		ArrayList<Integer> al3 = new ArrayList<>();

		al3.addAll(al1);
		al3.addAll(al2);
		
		System.out.println(al1 + "," + al2);
		
		for (int i = 0; i < al3.size(); i++) {
			al3.get(i);
			al3.set(i, i * i * i); // sis nestrada, jasaprot kapec un japabeidz
		}
		
		
		System.out.println(al3);

	}

}
