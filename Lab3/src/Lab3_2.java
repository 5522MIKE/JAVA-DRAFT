
/*ͳ�ƴӶԼ��������һ������������в�ͬ���ŵĸ�����������ĸ���ֻ��������ţ�������ĸ���ִ�Сд����

�����ʽ:

A 5

C 2

* 3*/
import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String a = input.nextLine();
		input.close();
		int num = a.length();
		char[] x = new char[num];
		int[] y = new int[num];
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			int j = 0;
			for (; j < sum; j++) {
				if (a.charAt(i) == x[j]) {
					y[j]++;
					break;
				}
			}
			if (j == sum) {
				x[sum] = a.charAt(i);
				y[i]++;
				sum++;
			}
		}
		for (int i = 0; i < sum; i++) {
			System.out.println(x[i] + ":" + y[i]);
		}

	}

}
