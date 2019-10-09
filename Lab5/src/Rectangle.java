/*编写一个矩形类Rectangle，
 * 将长与宽作为矩形类的属性，在构造函数中将长、宽初始化，
 * 定义一个成员方法求此矩形的面积。在主类中建立矩形类的实例进行测试。*/

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
