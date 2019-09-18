
public class DataType {

	public static void main(String[] args) {
		int x1 = 1;
		byte x2 = 1;
		short x3 = 1;
		long x4 = 1;

		float y1 = (float) 1.0;
		double y2 = 1.0;

		char z1 = 'A';

		boolean b = true;
		boolean a = false;

		if (x1 == 1) {
			b = true;
		} else {
			b = false;
		}

		for (; x3 < 5; x3++) {
			System.out.println(z1);
		}

		do {
			if (b) {
				b = false;
			} else {
				b = true;
			}
		} while (b);
	}

}
