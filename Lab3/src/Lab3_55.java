/*  a、骰子类名为Dice，其数值是随机的在1到6之间，具有适当的功能。

    b、每次扔3颗骰子，如果3个骰子的总和大于等于10，则为“大”，总和小于10则为“小”

    c、初始给出10000元的总游戏币，每次投注1000游戏币买“大”或“小”，如果投注成功，
              则获得投注数的0.8倍收益，失败则投注游戏币被扣除

    d、测试经过10次投注以后，剩下多少游戏币*/

// 本次用非类的方法实现

import java.util.Random;

public class Lab3_55 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		boolean flag = true;
		int total = 10000;
		
		for(int i=0;i<10;i++) {
			//扔骰子
			int sum=0;
			for(int j=0;j<3;j++) {
				int s = random.nextInt(5)+1;
				sum += s;
			}
			//判断大小
			if(sum>=10) {
				flag = true;
			}else {
				flag = false;
			}
			//买大小并判断正误
			int a = random.nextInt(1);
			if(a==1&&flag==true || a==0&&flag==false) {
				total += 800;
			}else {
				total -=1000;
			}
		}
		
		//输出结果
		System.out.println("剩余的游戏币：" + total);

	}

}
