/*��дһ��������Rectangle��
 * ���������Ϊ����������ԣ��ڹ��캯���н��������ʼ����
 * ����һ����Ա������˾��ε�������������н����������ʵ�����в��ԡ�*/

public class Rectangle {

	private double x, y;

	public Rectangle() {
		x = 0;
		y = 0;
	}

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double mul() {
		return x * y;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3);
		System.out.println(r.mul());
	}

}
