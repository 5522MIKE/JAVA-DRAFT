/*创建一个抽象类door，具有构造方法door()，输出“这是一扇门”，具有抽象方法open()，抽象方法close()。

创建一个接口alarm，具有方法alarming()。

创建一个类AlarmDoor，继承抽象类door，并实现接口alarm，实现的方法中输出适当的提示语句即可。

在主类中创建AlarmDoor的对象，并测试调用各个方法*/

abstract class door {

	public door() {
		System.out.println("这是一扇门。");
	}

	abstract void open();

	abstract void close();
}

interface alarm {
	void alarming();
}

class alarmdoor extends door implements alarm {

	public void open() {
		System.out.println("open");
	}

	public void close() {
		System.out.println("close");
	}

	public void alarming() {
		System.out.println("!!!!!");
	}

}

public class Lab5_4 {

	public static void main(String[] args) {
		alarmdoor a = new alarmdoor();
		a.alarming();

	}

}
