/*模仿P103例5.28测试StringBuilder的执行效率，
 * 并进行修改，要求生成的字符串是由小写字母构成的随机字符串*/

import java.util.Random;
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		
		System.out.print("请输入随机数长度：");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		
		Random random = new Random();
		
		StringBuilder builder = new StringBuilder("");
		for(int i = 0;i < x ;i++) {
			int s = random.nextInt(26)+97;
			builder.append((char)s);
		}
		System.out.println(builder);
      }
	
}
