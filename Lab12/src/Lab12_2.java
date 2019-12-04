
/*程序中有一个线程类，具体功能不限。
为这个线程类建立多个对象并运行，然后观察各个线程的执行顺序

输出结果如下:
1号线程正在运行，当前时间是???纳秒
……
3号线程正在运行，当前时间是???纳秒
……
提示:获得线程对象的ID，可用this.GetID（）
获得当前的精确时间，可用System.nanoTime()，该时间单位为纳秒，即十亿分之一秒*/

class ThreadTest extends Thread {
	private int count = 10;
	private boolean flag = false;

	public void run() {
		if (flag == false) {
			flag = true;
			System.out.println(this.getId() + "号线程正在运行，当前时间是" + System.nanoTime() + "纳秒");
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
