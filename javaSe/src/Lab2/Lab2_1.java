/*һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����������
 * ����6������Ϊ1��2��3����6=1+2+3�����6�ǡ���������
 * ��дһ��СӦ�ó�����1000֮�ڵ�����������*/
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
