
/*��������һ���߳��࣬���幦�ܲ��ޡ�
Ϊ����߳��ཨ������������У�Ȼ��۲�����̵߳�ִ��˳��

����������:
1���߳��������У���ǰʱ����???����
����
3���߳��������У���ǰʱ����???����
����
��ʾ:����̶߳����ID������this.GetID����
��õ�ǰ�ľ�ȷʱ�䣬����System.nanoTime()����ʱ�䵥λΪ���룬��ʮ�ڷ�֮һ��*/

class ThreadTest extends Thread {
	private int count = 10;
	private boolean flag = false;

	public void run() {
		if (flag == false) {
			flag = true;
			System.out.println(this.getId() + "���߳��������У���ǰʱ����" + System.nanoTime() + "����");
		}
		while (true) {
			// System.out.println(count+"");
			if (--count == 0) {
				return;
			}
		}
	}

	public ThreadTest() {
		this.start();
	}
}

public class Lab12_2 {

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
	}
}
