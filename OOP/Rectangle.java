
public class Rectangle {

	int garums;
	int platums;
	
	public Rectangle() {

	}

	public Rectangle(int g, int p) {
		garums = g;
		platums = p;

	}

	public Rectangle(int mala) {
		garums = mala;
		platums = mala;
	}

	public boolean isSquare() {
		return garums == platums;
	}

	public int area() {
		return garums * platums;

	}

	public int perimeter() {
		return 2 * (garums + platums);
	}

	
	
	public String toString() {
		return "";
	}

}
