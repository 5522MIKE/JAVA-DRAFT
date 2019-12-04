/*����������ʾ�̵߳ĸ���״̬�л��Լ���������ط��������� sleep��interrupt��join����
 * ÿ��״̬�л������̲߳���ʱ���ڿ���̨����ʾ��Ӧ��䣬
 * ���硰�̳߳����������߳̾����������߳�ִ�С������߳��жϡ������ȵ�*/

class ThreadTest2 extends Thread {

	public ThreadTest2() {
		System.out.println("�߳�B����");
		this.start();
		System.out.println("�߳�B����");
	}

	public void run() {
		System.out.println("�̼߳���");
		return;
	}
}

class ThreadTest1 extends Thread {
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
				System.out.println("�߳��ж�");
				return;
			}
			if (count == 5) {
				ThreadTest2 test2 = new ThreadTest2();
				try {
					test2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ThreadTest1() {
		System.out.println("�߳�A����");
		this.start();
		System.out.println("�߳�A����");
	}

	public void sleep() {
		try {
			Thread.sleep(2000);
			System.out.println("�߳�A����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Lab12_3 {

	public static void main(String[] args) {
		ThreadTest1 test = new ThreadTest1();
		test.sleep();
	}

}
