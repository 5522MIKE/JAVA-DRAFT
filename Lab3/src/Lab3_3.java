
/*输入一串数字表示的QQ号码，
 * 然后用正则表达式判断其是否符合QQ号码规则:长度为5到11位的数字，
 * 并且第一位不能为0。*/
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入QQ號碼：");
		String qq = input.nextLine();
		input.close();

		String Contrast = "[1-9][0-9]{4,10}";

		boolean flag = qq.matches(Contrast);

		if (flag)
			System.out.println("QQ号正确");
		else
			System.out.println("QQ号错误");
	}

}
