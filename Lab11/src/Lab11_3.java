import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*a��ʹ��writeUTF()��������������һ����ΪMyText.txt���ļ� ���ο���15.6��

b����MyText.txtѹ����MyText.zip�ļ� ���ο���15.7��

c����MyText.zip��ѹ����NewText.txt�ļ����ο���15.8��

d��ʹ��readUTF����������ȡNewTxt.txt�����ݣ�����ʾ�ڿ���̨�С����ο���15.6��

*/

class MyZip { // ������
	void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName)); // ����ZipOutputStream�����
		zip(out, inputFile, ""); // ���÷���
		System.out.println("ѹ���С�"); // �����Ϣ
		out.close(); // �����ر�
	}

	private void zip(ZipOutputStream out, File f, String base) throws Exception { // ��������
		if (f.isDirectory()) { // ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
			File[] fl = f.listFiles(); // ��ȡ·������
			out.putNextEntry(new ZipEntry(base + "/")); // д���Ŀ¼��entry
			base = base.length() == 0 ? "" : base + "/"; // �жϲ����Ƿ�Ϊ��
			for (int i = 0; i < fl.length; i++) { // ѭ�������������ļ�
				zip(out, fl[i], base + fl[i]);
			}
		} else {
			out.putNextEntry(new ZipEntry(base)); // �����µĽ����
			// ����FileInputStream����
			FileInputStream in = new FileInputStream(f);
			int b; // ����int�ͱ���
			System.out.println(base);
			while ((b = in.read()) != -1) { // ���û�е�������β��
				out.write(b); // ���ֽ�д�뵱ǰZIP��Ŀ
			}
			in.close(); // �ر���
		}
	}
}

public class Lab11_3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("MyText.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

		dataOutputStream.writeUTF("hello world!");
		dataOutputStream.close();
		
		MyZip book = new MyZip(); // ������������
		// ѹ��
		try {
			// ���÷���������Ϊѹ�����ļ���Ҫѹ���ļ�
			book.zip("hello.zip", new File("MyText.txt"));
			System.out.println("ѹ�����"); // �����Ϣ
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			// ����FileOutputStream����
			FileOutputStream fs = new FileOutputStream("word.txt");
			// ����DataOutputStream����
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("ʹ��writeUFT()����д������;"); // д������ļ�����
			ds.writeChars("ʹ��writeChars()����д������;");
			ds.writeBytes("ʹ��writeBytes()����д������.");
			ds.close(); // �����ر�
			// ����FileInputStream����
			FileInputStream fis = new FileInputStream("word.txt");
			// ����DataInputStream����
			DataInputStream dis = new DataInputStream(fis);
			System.out.print(dis.readUTF()); // ���ļ��������
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}

}
