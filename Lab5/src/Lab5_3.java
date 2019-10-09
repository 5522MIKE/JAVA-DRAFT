/*综合课本案例，编写一个包含final变量、
 * final static变量、final方法等知识的综合案例，并加以测试*/

public class Lab5_3 {

	private static final double PI = 3.1415;
	private double r;

	public void setr(double r) {
		this.r = r;
	}

	public final double area() {
		return PI * r * r;
	}

	public static void main(String[] args) {
		Lab5_3 c = new Lab5_3();
		c.setr(8);
		System.out.println(c.area());

	}

}
