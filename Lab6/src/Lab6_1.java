/*根据需要创建抽象类或接口，编写并实现有关联的以下三个类:

penson 类（属性:name ，gender，age；抽象方法:say（））

father类 （属性:name ，gender，age ；方法 : say （）:chinese，drive（）:car）   //（方法():后面为输出的文字）

son类（属性:name，gender，age ；方法: say（）:English,Chinese，drive（）:airplane，）

在主类中测试实现多态，将father和son的对象向上转型为Person对象，调用相应对象的方法。*/
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
