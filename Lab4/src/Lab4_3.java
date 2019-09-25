
/*生成10万个1到6之间的整数作为扔骰子的结果，
 * 统计出现的各个数字1、2、3、4、5、6的数量，大（4、5、6）小（1、2、3）的数量，
 * 分析它们的出现次数是否大致相同。*/

import java.util.Random;

public class Lab4_3 {

	public static void main(String[] args) {

		int s[] = new int[]{0,0,0,0,0,0}; 
		int big=0,small=0;
		Random random = new Random();
		for(int i=0;i<100000;i++) {
			int a = random.nextInt(6) + 1;
			switch(a){
				case 1:
					s[0]++;
					small++;
					break;
				case 2:
					s[1]++;
					small++;
					break;
				case 3:
					s[2]++;
					small++;
					break;
				case 4:
					s[3]++;
					big++;
					break;
				case 5:
					s[4]++;
					big++;
					break;
				case 6:
					s[5]++;
					big++;
					break;
			
			}
		}
		for(int i=0;i<6;i++) {
			System.out.println("投到" + (i+1) + "的次数为：" + s[i]);
		}
		System.out.println("投到大的次数为：" + big);
		System.out.println("投到小的次数为：" + small);
	}

}
