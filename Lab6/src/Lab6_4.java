import java.util.logging.ErrorManager;

/*��дһ���쳣��MyException�ࡣ
 * �ٱ�дһ��Student�࣬student���speak��int m������Ҫ��m��ֵ����1000ʱ��
 * �����׳�һ��MyException�����������д���Student��Ķ���
 * ������m>1000ʱʱ�ܷ���Ч���׳��쳣��*/
class MyEception extends Exception{
	public MyEception(String ErrorMessage){
		super(ErrorMessage);
	}
}

class Student{
	public void speak(int m)throws MyEception{
		if(m>1000){
			throw new MyEception("��������");
		}
		System.out.println(m);
	}
}


public class Lab6_4 {

	public static void main(String[] args) throws MyEception {
		Student s1 = new Student();
		s1.speak(1234);
	}

}
