import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*参考P349例19.2、19.3实现客户端与服务器端互相传递文字信息。*/
class MyTcp{
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	
	public void getServer() {
		try {
			server = new ServerSocket(8899);
			System.out.println("服务器套接字已经创建成功");
			while(true) {
				System.out.println("等待客户机的连接");
				socket = server.accept();
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClienMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void getClienMessage() {
		try {
			while(true) {
				System.out.println("客户机：" + reader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(reader != null) {
				reader.close();
			}
			if(socket != null) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Lab13_1_tcp {

	public static void main(String[] args) {
		MyTcp tcp = new MyTcp();
		tcp.getServer();
	}

}
