/*��2017�Ϻ���СѧGOC�����⣩
ˮ������һ��N�ø߶Ȳ���ͬ������СP���ÿ��Ϊ10�ľ��α�ʾ���ǡ�
����СC��ϲ����ʾ������Щͼ���иߵ������������ҳ��߶������������������½���������������
���磬N=7�����ĸ߶�Ϊ: 100 30 40 80 60 90 50 ��
����(30 40 80)��һ���ǵ��������ģ���������������ࣨ3�ã���*/
package Lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int down=0,up=0;
		int[] a= new int[10];
		var input = new Scanner(System.in);
		n = input.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]<a[i+1]) {
				up++;
			}
		}
	}

}
