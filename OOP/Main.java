
public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle (5, 4);
		System.out.println("Ir kvadrats 5x4: " + rec.isSquare());
		System.out.println("laukums: " + rec.area());
		System.out.println("perimetrs: " + rec.perimeter());
		System.out.println(rec.toString());
		
		
		Rectangle rec2 = new Rectangle (3, 8);
		System.out.println("Ir kvadrats 3x8: " + rec2.isSquare());
		System.out.println("laukums: " + rec2.area());
		System.out.println("perimetrs: " + rec2.perimeter());
		System.out.println(rec2.toString());
		
		Rectangle rec3 = new Rectangle (6);
		System.out.println("Ir kvadrats(malas garums 6): " + rec3.isSquare());
		System.out.println("laukums: " + rec3.area());
		System.out.println("perimetrs: " + rec3.perimeter());
		System.out.println(rec2.toString());

	}

}
