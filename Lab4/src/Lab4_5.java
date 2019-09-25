
/*根据矩阵乘法定义，使用二维数组求两个矩阵的积。 

    由矩阵乘法定义可知，

    1:当矩阵A的列数等于矩阵B的行数时，A与B可以相乘。

    2:矩阵C的行数等于矩阵A的行数，C的列数等于B的列数。

    3:乘积C的第i行第j列的元素C[i][j] 等于矩阵A的第i行的元素与矩阵B的第j列对应元素乘积之和。

    根据矩阵乘法法则 求以下intArr1,intArr2二维数组构成的矩阵的乘积。    

     int[] intArr1 ={{1,2,3,4},{2,3,4,5}}  

     int[] intArr2 ={{1,2},{3,4},{5,6},{7,8}};  */

import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 第一矩阵
		System.out.println("下面是第一个矩阵的输入：");
		System.out.println("请输入矩阵的阶数：");
		int x1 = input.nextInt();
		System.out.println("请输入矩阵的列数：");
		int y1 = input.nextInt();
		int m1[][] = new int[x1][y1];

		// 输入矩阵
		for (int i = 0; i < x1; i++) {
			System.out.print("请输入第" + (i + 1) + "阶：");
			for (int j = 0; j < y1; j++) {
				m1[i][j] = input.nextInt();
			}
			System.out.println();
		}

		// 第二矩阵
		System.out.println("下面是第二个矩阵的输入：");
		System.out.println("请输入矩阵的阶数：");
		int x2 = input.nextInt();
		System.out.println("请输入矩阵的列数：");
		int y2 = input.nextInt();
		int m2[][] = new int[x2][y2];

		// 相乘后的数组储存
		int m3[][] = new int[x1][y2];

		// 输入矩阵
		for (int i = 0; i < x2; i++) {
			System.out.print("请输入第" + (i + 1) + "阶：");
			for (int j = 0; j < y2; j++) {
				m2[i][j] = input.nextInt();
			}
			System.out.println();
		}
		input.close();

		// 矩阵相乘
		if (x1 == y2 && y1 == x2) {
			System.out.println("这两个矩阵可以相乘");
			for (int i = 0; i < x1; i++) {
				System.out.print("第" + (i + 1) + "阶：");
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

		// 输出数组
		System.out.print("相乘后的数组：");
		for (int i = 0; i < x1; i++) {
			System.out.print("这是请输入第" + (i + 1) + "阶：");
			for (int j = 0; j < y2; j++) {
				System.out.print(" " + m3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
