/*����һ��������door�����й��췽��door()�����������һ���š������г��󷽷�open()�����󷽷�close()��

����һ���ӿ�alarm�����з���alarming()��

����һ����AlarmDoor���̳г�����door����ʵ�ֽӿ�alarm��ʵ�ֵķ���������ʵ�����ʾ��伴�ɡ�

�������д���AlarmDoor�Ķ��󣬲����Ե��ø�������*/

abstract class door {

	public door() {
		System.out.println("����һ���š�");
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
