import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.*;

import javax.swing.JFrame;

/*建立一个程序，用于获取学者网主页http://www.scholat.com的源代码,并在控制台显示出来。
参考代码:
……

URL page = new URL("http://www.scholat.com");

HttpURLConnection conn = (HttpURLConnection) page.openConnection();

InputStreamReader in = new InputStreamReader((InputStream)conn.getContent());

BufferedReader buff = new BufferedReader(in);

……
*/

class MyCliensch {
	Socket socket;
	private PrintWriter writer;
	
	public void connect() {
		System.out.println("Wait...");
		try {
			URL page = new URL("http://www.scholat.com");

			HttpURLConnection conn = (HttpURLConnection) page.openConnection();


			InputStreamReader in = new InputStreamReader((InputStream)conn.getContent());

			BufferedReader buff = new BufferedReader(in);
			
			String message = "";  
			String line = null;  
			while((line = buff.readLine()) != null) {  
			    message += line;  
			}  
			System.out.println(message);  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

public class Lab13_3 {

	public static void main(String[] args) {
		MyCliensch myClien = new MyCliensch();
		myClien.connect();

	}

}
