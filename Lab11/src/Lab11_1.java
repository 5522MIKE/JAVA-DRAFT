
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/*ʹ���ļ�����������һ����ΪMyFile.txt���ļ���
 * ��д�롰Java������ơ���Ȼ����ʹ���ļ��������ȡ���ļ�������������ʾ�ڿ���̨�С�*/
public class Lab11_1 {

	public static void main(String[] args) {
		File file = new java.io.File("MyFile.txt");
		// д���ļ�
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			byte buy[] = "Java�������".getBytes();
			outputStream.write(buy);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ��ȡ������ļ��ڵ���Ϣ
		try {
			FileInputStream inputStream = new FileInputStream(file);
			byte in[] = new byte[1024];
			int len = inputStream.read(in);
			System.out.println("�ļ��е���Ϣ�ǣ�" + new String(in, 0, len));
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
