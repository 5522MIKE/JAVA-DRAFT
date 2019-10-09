import java.util.Scanner;

/*①定义一个接口，其中包含一个计算面积的抽象方法和一个计算周长的抽象方法；

②输入数据为圆的半径、三角形的三条边长、矩形的长和宽，对于用户的输入要有友好提示；

③程序能够排除输入过程中的非法数据（如:输入的长度数据为负数或字符；输入的三角形三条边数据不能组成三角形；

④计算圆、三角形、矩形的面积和周长，并输出原始数据和结算结果。*/

interface computation {

	double area();

	double perimeter();
}

class circle implements computation {

	private static final double PI = 3.1415;
	private double r;

	public circle() {
		r=0;
	}
	
	public circle(double r) {
		if (r > 0) {
			this.r = r;
		} else {
			System.out.println("数据不合法！");
			System.exit(1);
		}
	}

	public void setr(double r) {
		if (r > 0) {
			this.r = r;
		} else {
			System.out.println("数据不合法！");
			System.exit(1);
		}
	}

	public double area() {
		return PI * r * r;
	}

	public double perimeter() {
		return 2 * PI * r;
	}
}

class triangle implements computation {

	private double x, y, z;

	public triangle() {
		x=0;
		y=0;
		z=0;
	}
	
	public triangle(double x, double y, double z) {
		if (x + y > z && x + z > y && z + y > x) {
			this.x = x;
			this.y = y;
			this.z = z;
		} else {
			System.out.println("数据不合法！");
			System.exit(1);
		}
	}
	
	public void set(double x, double y, double z) {
		if (x + y > z && x + z > y && z + y > x) {
			this.x = x;
			this.y = y;
			this.z = z;
		} else {
			System.out.println("数据不合法！");
			System.exit(1);
		}
	}

	public double area() {
		double p = (x + y + z) / 2;
		double a = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		return a;
	}

	public double perimeter() {
		return x + y + z;
	}
}

public class Lab5_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		circle c = new circle();
		System.out.println("请输入圆的半径：");
		double r = input.nextDouble();
		c.setr(r);
		System.out.printf("圆的面积为"+"%.2f\n",c.area());
		System.out.printf("圆的周长为"+"%.2f\n",c.perimeter());
		
		triangle t = new triangle();
		System.out.println("请输入三角形的三条边：");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		t.set(x,y,z);
		System.out.printf("三角形圆的面积为"+"%.2f\n",t.area());
		System.out.printf("三角形的周长为"+"%.2f\n",t.perimeter());
		
		input.close();
	}

}
