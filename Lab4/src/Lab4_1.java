
/*ʵ�־����ת�ù��ܣ����û�����һ����������������������ݣ�
 * Ȼ�������ת�ú�Ľ�������Գɹ��󱣴沢�ύLab2_4.java�ļ���*/
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("���������Ľ�����");
		int x = input.nextInt();
		System.out.println("����������������");
		int y = input.nextInt();
		int m[][] = new int[x][y];

		// �������
		for (int i = 0; i < x; i++) {
			System.out.print("�������" + (i + 1) + "�ף�");
			for (int j = 0; j < y; j++) {
				m[i][j] = input.nextInt();
			}
			System.out.println();
		}
		input.close();

		// ת��
		for (int i = 0; i < y; i++) {
			System.out.print("����ת�ú�ĵ�" + (i + 1) + "�ף�");
			for (int j = 0; j < x; j++) {
				System.out.print(" " + m[j][i] + " ");
			}
			System.out.println();
		}

	}

}
