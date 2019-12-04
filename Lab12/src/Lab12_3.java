/*建立程序演示线程的各种状态切换以及操作的相关方法（包括 sleep，interrupt，join），
 * 每个状态切换或者线程操作时，在控制台中显示相应语句，
 * 例如“线程出生”、“线程就绪”、“线程执行”、“线程中断”……等等*/

class ThreadTest2 extends Thread {

	public ThreadTest2() {
		System.out.println("线程B出生");
		this.start();
		System.out.println("线程B就绪");
	}

	public void run() {
		System.out.println("线程加入");
		return;
	}
}

class ThreadTest1 extends Thread {
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
				System.out.println("线程中断");
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
		System.out.println("线程A出生");
		this.start();
		System.out.println("线程A就绪");
	}

	public void sleep() {
		try {
			Thread.sleep(2000);
			System.out.println("线程A休眠");
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
