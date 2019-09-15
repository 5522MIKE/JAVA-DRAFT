/*（2017南海区小学GOC测评题）
水塘边有一排N棵高度不相同的树，小P想用宽度为10的矩形表示他们。
不过小C不喜欢表示树的这些图形有高低起伏，因此想找出高度是连续上升或连续下降的数量最多的树。
例如，N=7，树的高度为: 100 30 40 80 60 90 50 。
其中(30 40 80)这一段是单调上升的，并且树的数量最多（3棵）。*/
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
