/*�ۺϿα���������дһ������final������
 * final static������final������֪ʶ���ۺϰ����������Բ���*/

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
