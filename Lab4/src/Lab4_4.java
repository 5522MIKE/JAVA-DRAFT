
/*�����������Ȳ�С��20λ�Ĵ������ĺ͡���������һ����������ǰ10�����ӣ�������1�ͱ���*/

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		long x = input.nextLong();
		System.out.println("������ڶ�������");
		long y = input.nextLong();
		input.close();

		long add, sub;
		add = y + x;
		System.out.println("����֮��Ϊ��" + add);
		if (y > x) {
			sub = y - x;
		} else {
			sub = x - y;
		}
		System.out.println("����֮��Ϊ��" + sub);

		int f = 0;
		System.out.println("��һ����������ǰ10������Ϊ��");
		for (long i = 2; i < x || f < 10; i++) {
			if (x % i == 0) {
				System.out.print(" " + i + " ");
				f++;
			}
		}
	}

}
