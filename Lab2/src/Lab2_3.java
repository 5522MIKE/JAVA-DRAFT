/*��2017�Ϻ���СѧGOC�����⣩
ˮ������һ��N�ø߶Ȳ���ͬ������СP���ÿ��Ϊ10�ľ��α�ʾ���ǡ�
����СC��ϲ����ʾ������Щͼ���иߵ������������ҳ��߶������������������½���������������
���磬N=7�����ĸ߶�Ϊ: 100 30 40 80 60 90 50 ��
����(30 40 80)��һ���ǵ��������ģ���������������ࣨ3�ã���*/
import java.util.*;


public class Lab2_3 {

	public static void main(String[] args) {
		int n;
		int down = 0,up = 0;
		int min = 0,max = 0;
		int sum = 0;
		boolean flag = true;
		//����
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = input.nextInt();
		}
		input.close();
		//�ж�
		for(int i = 0;i < n-1;i++) {
			up = 0;
			down = 0;
			
			for(;i < n-1 && a[i] < a[i+1];i++) {
				up++;
			}
			if(up > sum) {
				max = i-up;
				flag = true;
				sum = up;
			}
			
			for(;i < n-1 && a[i] > a[i+1];i++) {
				down++;
			}
			if(down > sum) {
				min = i-down;
				flag = false;
				sum = down;
			}
		}
		
		if(flag == true) {
			System.out.println("����(");
			for(int i = max;i<=max+up;i++) {
				System.out.println(a[i] + " ");
			}
			up++;
			System.out.println(")��һ���ǵ��������ģ���������������ࣨ" + up + "�ã���");
		}else {
			System.out.println("����(");
			for(int i = min;i<=min+down;i++) {
				System.out.println(a[i] + " ");
			}
			down++;
			System.out.println(")��һ���ǵ����½��ģ���������������ࣨ" + down + "�ã���");
		}
	}

}
