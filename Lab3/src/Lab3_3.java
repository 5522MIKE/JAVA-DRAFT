
/*����һ�����ֱ�ʾ��QQ���룬
 * Ȼ����������ʽ�ж����Ƿ����QQ�������:����Ϊ5��11λ�����֣�
 * ���ҵ�һλ����Ϊ0��*/
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("������QQ̖�a��");
		String qq = input.nextLine();
		input.close();

		String Contrast = "[1-9][0-9]{4,10}";

		boolean flag = qq.matches(Contrast);

		if (flag)
			System.out.println("QQ����ȷ");
		else
			System.out.println("QQ�Ŵ���");
	}

}
