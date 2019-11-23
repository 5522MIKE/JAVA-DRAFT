
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/*使用文件输入流创建一个名为MyFile.txt的文件，
 * 并写入“Java程序设计”，然后再使用文件输出流读取该文件，并将内容显示在控制台中。*/
public class Lab11_1 {

	public static void main(String[] args) {
		File file = new java.io.File("MyFile.txt");
		// 写入文件
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			byte buy[] = "Java程序设计".getBytes();
			outputStream.write(buy);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 读取并输出文件内的信息
		try {
			FileInputStream inputStream = new FileInputStream(file);
			byte in[] = new byte[1024];
			int len = inputStream.read(in);
			System.out.println("文件中的信息是：" + new String(in, 0, len));
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
