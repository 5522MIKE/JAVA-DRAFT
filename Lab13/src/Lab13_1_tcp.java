import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*�ο�P349��19.2��19.3ʵ�ֿͻ�����������˻��ഫ��������Ϣ��*/
class MyTcp{
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	
	public void getServer() {
		try {
			server = new ServerSocket(8899);
			System.out.println("�������׽����Ѿ������ɹ�");
			while(true) {
				System.out.println("�ȴ��ͻ���������");
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
				System.out.println("�ͻ�����" + reader.readLine());
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
