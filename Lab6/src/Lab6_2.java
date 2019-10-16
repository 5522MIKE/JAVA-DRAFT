import java.awt.CardLayout;

/*定义一个汽车(Car)接口，其中有抽象方法   void run();

在CarTest类中实现接口Car，并定义一个方法   void CarRun(Car ins);

并在该类的main方法中调用该方法。

要求:分别使用下列内部类完成此题:

成员内部类

局部内部类

匿名类*/

interface Car{
		void run();
	}
//成员内部类
//public class Lab6_2 {
//	class CarTest implements Car{
//		public void run(){
//			System.out.println("run");
//		}
//		public void CarRun(Car ins){
//			ins.run();
//		}
//	}
//
//	public static void main(String[] args) {
//		Lab6_2 a = new Lab6_2();
//		CarTest b = a.new CarTest();
//		b.CarRun(b);
//	}
//}

//局部内部类
//public class Lab6_2 {
//	public void draft(){
//		class CarTest implements Car{
//			
//			public void run(){
//				System.out.println("run");
//			}
//			public void CarRun(Car ins){
//				ins.run();
//			}
//		}
//		CarTest b = new CarTest();
//		b.CarRun(b);
//	}
//
//	public static void main(String[] args) {
//		Lab6_2 a = new Lab6_2();
//		a.draft();
//	}
//}

//匿名类
public class Lab6_2 {


	public static void main(String[] args) {
		Car a = new Car() {
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		a.run();
	}
}