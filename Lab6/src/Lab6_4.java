import java.util.logging.ErrorManager;

/*编写一个异常类MyException类。
 * 再编写一个Student类，student类的speak（int m）方法要求当m的值超过1000时，
 * 方法抛出一个MyException对象。在主类中创建Student类的对象，
 * 并测试m>1000时时能否有效的抛出异常。*/
class MyEception extends Exception{
	public MyEception(String ErrorMessage){
		super(ErrorMessage);
	}
}

class Student{
	public void speak(int m)throws MyEception{
		if(m>1000){
			throw new MyEception("参数过大");
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
