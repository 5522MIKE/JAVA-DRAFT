/*��д������ʾ�쳣�������try-catch-finally�Ĵ��롣

�ڴ˳����У���һ�����ֳ���0ʱ��������ArithmeticException�쳣���������쳣��catch����*/
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
