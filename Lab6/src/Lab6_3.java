/*编写用于演示异常处理机制try-catch-finally的代码。

在此程序中，当一个数字除以0时，将引发ArithmeticException异常，引发的异常被catch捕获。*/
public class Lab6_3 {

	public static void main(String[] args) {
		try{
			int a=5,b=0;
			System.out.println(a/b);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}

}
