import java.awt.CardLayout;

/*����һ������(Car)�ӿڣ������г��󷽷�   void run();

��CarTest����ʵ�ֽӿ�Car��������һ������   void CarRun(Car ins);

���ڸ����main�����е��ø÷�����

Ҫ��:�ֱ�ʹ�������ڲ�����ɴ���:

��Ա�ڲ���

�ֲ��ڲ���

������*/

interface Car{
		void run();
	}
//��Ա�ڲ���
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

//�ֲ��ڲ���
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

//������
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