import java.util.Scanner;

/*�ٶ���һ���ӿڣ����а���һ����������ĳ��󷽷���һ�������ܳ��ĳ��󷽷���

����������ΪԲ�İ뾶�������ε������߳������εĳ��Ϳ������û�������Ҫ���Ѻ���ʾ��

�۳����ܹ��ų���������еķǷ����ݣ���:����ĳ�������Ϊ�������ַ�����������������������ݲ�����������Σ�

�ܼ���Բ�������Ρ����ε�������ܳ��������ԭʼ���ݺͽ�������*/

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
			System.out.println("���ݲ��Ϸ���");
			System.exit(1);
		}
	}

	public void setr(double r) {
		if (r > 0) {
			this.r = r;
		} else {
			System.out.println("���ݲ��Ϸ���");
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
			System.out.println("���ݲ��Ϸ���");
			System.exit(1);
		}
	}
	
	public void set(double x, double y, double z) {
		if (x + y > z && x + z > y && z + y > x) {
			this.x = x;
			this.y = y;
			this.z = z;
		} else {
			System.out.println("���ݲ��Ϸ���");
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
		System.out.println("������Բ�İ뾶��");
		double r = input.nextDouble();
		c.setr(r);
		System.out.printf("Բ�����Ϊ"+"%.2f\n",c.area());
		System.out.printf("Բ���ܳ�Ϊ"+"%.2f\n",c.perimeter());
		
		triangle t = new triangle();
		System.out.println("�����������ε������ߣ�");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		t.set(x,y,z);
		System.out.printf("������Բ�����Ϊ"+"%.2f\n",t.area());
		System.out.printf("�����ε��ܳ�Ϊ"+"%.2f\n",t.perimeter());
		
		input.close();
	}

}
