
/*���ݾ���˷����壬ʹ�ö�ά��������������Ļ��� 

    �ɾ���˷������֪��

    1:������A���������ھ���B������ʱ��A��B������ˡ�

    2:����C���������ھ���A��������C����������B��������

    3:�˻�C�ĵ�i�е�j�е�Ԫ��C[i][j] ���ھ���A�ĵ�i�е�Ԫ�������B�ĵ�j�ж�ӦԪ�س˻�֮�͡�

    ���ݾ���˷����� ������intArr1,intArr2��ά���鹹�ɵľ���ĳ˻���    

     int[] intArr1 ={{1,2,3,4},{2,3,4,5}}  

     int[] intArr2 ={{1,2},{3,4},{5,6},{7,8}};  */

import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// ��һ����
		System.out.println("�����ǵ�һ����������룺");
		System.out.println("���������Ľ�����");
		int x1 = input.nextInt();
		System.out.println("����������������");
		int y1 = input.nextInt();
		int m1[][] = new int[x1][y1];

		// �������
		for (int i = 0; i < x1; i++) {
			System.out.print("�������" + (i + 1) + "�ף�");
			for (int j = 0; j < y1; j++) {
				m1[i][j] = input.nextInt();
			}
			System.out.println();
		}

		// �ڶ�����
		System.out.println("�����ǵڶ�����������룺");
		System.out.println("���������Ľ�����");
		int x2 = input.nextInt();
		System.out.println("����������������");
		int y2 = input.nextInt();
		int m2[][] = new int[x2][y2];

		// ��˺�����鴢��
		int m3[][] = new int[x1][y2];

		// �������
		for (int i = 0; i < x2; i++) {
			System.out.print("�������" + (i + 1) + "�ף�");
			for (int j = 0; j < y2; j++) {
				m2[i][j] = input.nextInt();
			}
			System.out.println();
		}
		input.close();

		// �������
		if (x1 == y2 && y1 == x2) {
			System.out.println("����������������");
			for (int i = 0; i < x1; i++) {
				System.out.print("��" + (i + 1) + "�ף�");
				for (int j = 0; j < y2; j++) {
					int sum = 0;
					for (int k = 0; k < y1; k++) {
						sum += m1[i][k] * m2[k][j];
					}
					m3[i][j] = sum;
				}
				System.out.println();
			}
		}

		// �������
		System.out.print("��˺�����飺");
		for (int i = 0; i < x1; i++) {
			System.out.print("�����������" + (i + 1) + "�ף�");
			for (int j = 0; j < y2; j++) {
				System.out.print(" " + m3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
