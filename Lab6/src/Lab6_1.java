/*������Ҫ�����������ӿڣ���д��ʵ���й���������������:

penson �ࣨ����:name ��gender��age�����󷽷�:say������

father�� ������:name ��gender��age ������ : say ����:chinese��drive����:car��   //������():����Ϊ��������֣�

son�ࣨ����:name��gender��age ������: say����:English,Chinese��drive����:airplane����

�������в���ʵ�ֶ�̬����father��son�Ķ�������ת��ΪPerson���󣬵�����Ӧ����ķ�����*/
abstract class person {
	private String name;
	private char gender;
	private int age;

	abstract void say();
}

class father extends person {
	public void say() {
		System.out.println("chinese");
	}

	public void drive() {
		System.out.println("car");
	}
}

class son extends father {
	public void say() {
		System.out.println("English,Chinese");
	}

	public void drive() {
		System.out.println("airplane");
	}
}

public class Lab6_1 {

	public static void main(String[] args) {
		son ming = new son();
		ming.say();
		ming.drive();
		father m = new son();
		m.drive();
		person a = new father();
		a.say();
		// son hSon = (son) new father();
		// hSon.say();

	}

}
