
/*ģ��P103��5.28����StringBuilder��ִ��Ч�ʣ�
 * �������޸ģ�Ҫ�����ɵ��ַ�������Сд��ĸ���ɵ�����ַ���*/

import java.util.Random;
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {

		System.out.print("��������������ȣ�");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();

		Random random = new Random();

		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < x; i++) {
			int s = random.nextInt(26) + 97;
			builder.append((char) s);
		}
		System.out.println(builder);
	}

}
