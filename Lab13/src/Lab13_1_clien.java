import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
/*�ο�P349��19.2��19.3ʵ�ֿͻ�����������˻��ഫ��������Ϣ��*/
class MyClien extends JFrame{
	private PrintWriter writer;
	Socket socket;
	private JTextArea tArea = new JTextArea();
	private JTextField tField = new JTextField();
	Container container;
	
	public MyClien(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		container = this.getContentPane();
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(tArea);
		container.add(tField,"South");
		tField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				writer.println(tField.getText());
				tArea.append(tField.getText()+"\n");
				tArea.setSelectionEnd(tArea.getText().length());
				tField.setText("");
			}
		});
		
	}
	

	public void connect() {
		tArea.append("��������\n");
		try {
			socket = new Socket("127.0.0.1",8899);
			writer = new PrintWriter(socket.getOutputStream(),true);
			tArea.append("�������\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class Lab13_1_clien {

	public static void main(String[] args) {
		MyClien clien = new MyClien("�������������");
		clien.setSize(200,200);
		clien.setVisible(true);
		clien.connect();
	}

}
