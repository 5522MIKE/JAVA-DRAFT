
/*实现矩阵的转置功能，即用户输入一个矩阵的行列数及具体数据，
 * 然后输出其转置后的结果。测试成功后保存并提交Lab2_4.java文件。*/
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入矩阵的阶数：");
		int x = input.nextInt();
		System.out.println("请输入矩阵的列数：");
		int y = input.nextInt();
		int m[][] = new int[x][y];

		// 输入矩阵
		for (int i = 0; i < x; i++) {
			System.out.print("请输入第" + (i + 1) + "阶：");
			for (int j = 0; j < y; j++) {
				m[i][j] = input.nextInt();
			}
			System.out.println();
		}
		input.close();

		// 转置
		for (int i = 0; i < y; i++) {
			System.out.print("这是转置后的第" + (i + 1) + "阶：");
			for (int j = 0; j < x; j++) {
				System.out.print(" " + m[j][i] + " ");
			}
			System.out.println();
		}

	}

}
