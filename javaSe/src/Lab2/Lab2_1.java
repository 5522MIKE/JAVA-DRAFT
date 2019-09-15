/*一个数如果恰好等于它的因子之和，这个数就称为“完数”。
 * 例如6的因子为1、2、3，而6=1+2+3。因此6是“完数”。
 * 编写一个小应用程序求1000之内的所有完数。*/
package Lab2;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=1,x=2;
		for(;x<=1000;x++) {
			sum=1;
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					sum+=i;
				}
			}
			
			if(sum==x) {
				System.out.println(x);
			}
			
		}
		
	}

}
