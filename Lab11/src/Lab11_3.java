import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*a、使用writeUTF()方法创建并保存一个名为MyText.txt的文件 （参考例15.6）

b、将MyText.txt压缩成MyText.zip文件 （参考例15.7）

c、将MyText.zip解压缩成NewText.txt文件（参考例15.8）

d、使用readUTF（）方法读取NewTxt.txt的内容，并显示在控制台中。（参考例15.6）

*/

class MyZip { // 创建类
	void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName)); // 创建ZipOutputStream类对象
		zip(out, inputFile, ""); // 调用方法
		System.out.println("压缩中…"); // 输出信息
		out.close(); // 将流关闭
	}

	private void zip(ZipOutputStream out, File f, String base) throws Exception { // 方法重载
		if (f.isDirectory()) { // 测试此抽象路径名表示的文件是否是一个目录
			File[] fl = f.listFiles(); // 获取路径数组
			out.putNextEntry(new ZipEntry(base + "/")); // 写入此目录的entry
			base = base.length() == 0 ? "" : base + "/"; // 判断参数是否为空
			for (int i = 0; i < fl.length; i++) { // 循环遍历数组中文件
				zip(out, fl[i], base + fl[i]);
			}
		} else {
			out.putNextEntry(new ZipEntry(base)); // 创建新的进入点
			// 创建FileInputStream对象
			FileInputStream in = new FileInputStream(f);
			int b; // 定义int型变量
			System.out.println(base);
			while ((b = in.read()) != -1) { // 如果没有到达流的尾部
				out.write(b); // 将字节写入当前ZIP条目
			}
			in.close(); // 关闭流
		}
	}
}

public class Lab11_3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("MyText.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

		dataOutputStream.writeUTF("hello world!");
		dataOutputStream.close();
		
		MyZip book = new MyZip(); // 创建本例对象
		// 压缩
		try {
			// 调用方法，参数为压缩后文件与要压缩文件
			book.zip("hello.zip", new File("MyText.txt"));
			System.out.println("压缩完成"); // 输出信息
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		try {
			// 创建FileOutputStream对象
			FileOutputStream fs = new FileOutputStream("word.txt");
			// 创建DataOutputStream对象
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用writeUFT()方法写入数据;"); // 写入磁盘文件数据
			ds.writeChars("使用writeChars()方法写入数据;");
			ds.writeBytes("使用writeBytes()方法写入数据.");
			ds.close(); // 将流关闭
			// 创建FileInputStream对象
			FileInputStream fis = new FileInputStream("word.txt");
			// 创建DataInputStream对象
			DataInputStream dis = new DataInputStream(fis);
			System.out.print(dis.readUTF()); // 将文件数据输出
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

}
