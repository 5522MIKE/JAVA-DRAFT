/*  a����������ΪDice������ֵ���������1��6֮�䣬�����ʵ��Ĺ��ܡ�

    b��ÿ����3�����ӣ����3�����ӵ��ܺʹ��ڵ���10����Ϊ���󡱣��ܺ�С��10��Ϊ��С��

    c����ʼ����10000Ԫ������Ϸ�ң�ÿ��Ͷע1000��Ϸ���򡰴󡱻�С�������Ͷע�ɹ���
              ����Ͷע����0.8�����棬ʧ����Ͷע��Ϸ�ұ��۳�

    d�����Ծ���10��Ͷע�Ժ�ʣ�¶�����Ϸ��*/

// �����÷���ķ���ʵ��

import java.util.Random;

public class Lab3_55 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		boolean flag = true;
		int total = 10000;
		
		for(int i=0;i<10;i++) {
			//������
			int sum=0;
			for(int j=0;j<3;j++) {
				int s = random.nextInt(5)+1;
				sum += s;
			}
			//�жϴ�С
			if(sum>=10) {
				flag = true;
			}else {
				flag = false;
			}
			//���С���ж�����
			int a = random.nextInt(1);
			if(a==1&&flag==true || a==0&&flag==false) {
				total += 800;
			}else {
				total -=1000;
			}
		}
		
		//������
		System.out.println("ʣ�����Ϸ�ң�" + total);

	}

}
