
/*����10���1��6֮���������Ϊ�����ӵĽ����
 * ͳ�Ƴ��ֵĸ�������1��2��3��4��5��6����������4��5��6��С��1��2��3����������
 * �������ǵĳ��ִ����Ƿ������ͬ��*/

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
			System.out.println("Ͷ��" + (i+1) + "�Ĵ���Ϊ��" + s[i]);
		}
		System.out.println("Ͷ����Ĵ���Ϊ��" + big);
		System.out.println("Ͷ��С�Ĵ���Ϊ��" + small);
	}

}
