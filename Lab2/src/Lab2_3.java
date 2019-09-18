/*（2017南海区小学GOC测评题）
水塘边有一排N棵高度不相同的树，小P想用宽度为10的矩形表示他们。
不过小C不喜欢表示树的这些图形有高低起伏，因此想找出高度是连续上升或连续下降的数量最多的树。
例如，N=7，树的高度为: 100 30 40 80 60 90 50 。
其中(30 40 80)这一段是单调上升的，并且树的数量最多（3棵）。*/
import java.util.*;


public class Lab2_3 {

	public static void main(String[] args) {
		int n;
		int down = 0,up = 0;
		int min = 0,max = 0;
		int sum = 0;
		boolean flag = true;
		//输入
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = input.nextInt();
		}
		input.close();
		//判断
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
			System.out.println("其中(");
			for(int i = max;i<=max+up;i++) {
				System.out.println(a[i] + " ");
			}
			up++;
			System.out.println(")这一段是单调上升的，并且树的数量最多（" + up + "棵）。");
		}else {
			System.out.println("其中(");
			for(int i = min;i<=min+down;i++) {
				System.out.println(a[i] + " ");
			}
			down++;
			System.out.println(")这一段是单调下降的，并且树的数量最多（" + down + "棵）。");
		}
	}

}
