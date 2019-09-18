
/*创建一个项目，并在该项目中建立一个名为Lab1_3的类，在其中输出N个斐波那契级数。*/
import java.io.*;

public class Lab_3 {

	public static void main(String[] args) throws IOException {
		int n = (int) System.in.read();
		n = n - 48;
		int x = 0;
		int y = 1;
		int h = 0;
		int i = 0;
		for (; i < n; i++) {
			System.out.println(y);
			h = x + y;
			x = y;
			y = h;
		}

	}

}
