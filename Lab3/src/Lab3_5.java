/*  a����������ΪDice������ֵ���������1��6֮�䣬�����ʵ��Ĺ��ܡ�

    b��ÿ����3�����ӣ����3�����ӵ��ܺʹ��ڵ���10����Ϊ���󡱣��ܺ�С��10��Ϊ��С��

    c����ʼ����10000Ԫ������Ϸ�ң�ÿ��Ͷע1000��Ϸ���򡰴󡱻�С�������Ͷע�ɹ���
              ����Ͷע����0.8�����棬ʧ����Ͷע��Ϸ�ұ��۳�

    d�����Ծ���10��Ͷע�Ժ�ʣ�¶�����Ϸ��*/

import java.util.Random;

public class Lab3_5 {
		
		public static int throwDice(){
			Random random = new Random();
			int s = random.nextInt(5)+1;
			return s;
		}
		
		public static boolean judgeDice() {
			boolean flag = true;
			
			for(int i=0;i<10;i++) {
				int sum = 0;
				//������
				for(int j=0;j<3;j++) {
					sum += throwDice();
				}
				
				//�жϴ�С
				if(sum>=10) {
					flag = true;
				}else {
					flag = false;
				}
			}
			return flag;
		}
	
		public static void main(String[] args) {
		
			int total = 10000;
			boolean flag1;
			//���ѹ��С
			Random random = new Random();			
			int a = random.nextInt(1);

			for(int i=0;i<10;i++) {
				flag1 = Lab3_5.judgeDice();
				if(a==1&&flag1==true || a==0&&flag1==false) {
					total += 800;
				}else {
					total -=1000;

				}
			}
			
			//������
			System.out.println("ʣ�����Ϸ�ң�" + total);
		}
		
}
