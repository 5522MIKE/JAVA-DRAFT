
/*计算两个长度不小于20位的大整数的和、差，并计算第一个大整数的前10个因子（不包括1和本身）*/

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		long x = input.nextLong();
		System.out.println("请输入第二个数：");
		long y = input.nextLong();
		input.close();

		long add, sub;
		add = y + x;
		System.out.println("两数之和为：" + add);
		if (y > x) {
			sub = y - x;
		} else {
			sub = x - y;
		}
		System.out.println("两数之差为：" + sub);

		int f = 0;
		System.out.println("第一个大整数的前10个因子为：");
		for (long i = 2; i < x || f < 10; i++) {
			if (x % i == 0) {
				System.out.print(" " + i + " ");
				f++;
			}
		}
	}

}
