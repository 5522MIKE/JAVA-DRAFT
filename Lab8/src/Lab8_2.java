import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*����һ�����壬���ڲ���Java�ı߽粼�ֺ����񲼾ֹ�������
 * ������4����ť�ֱ�λ���ıߣ��ֱ���ʾ���ϡ��¡����ҡ����м�������һ��JPanel��
 * ������3��3�й�9����ť���ֱ���ʾ��ť1����ť2����ť3����*/
public class Lab8_2 extends JFrame {
	public Lab8_2(String title) {
		super(title);
		setLayout(new BorderLayout());
		Container con = getContentPane();
		setLayout(new BorderLayout());
		JButton jb1 = new JButton("��");
		JButton jb2 = new JButton("��");
		JButton jb3 = new JButton("��");
		JButton jb4 = new JButton("��");
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 3, 0, 0));
		for (int i = 1; i <= 9; i++) {
			JButton jb = new JButton("��ť" + i);
			jp.add(jb);
		}
		setLayout(new BorderLayout());
		con.add(jb1, BorderLayout.NORTH);
		con.add(jb2, BorderLayout.SOUTH);
		con.add(jb3, BorderLayout.WEST);
		con.add(jb4, BorderLayout.EAST);
		con.add(jp, BorderLayout.CENTER);
		setVisible(true);
		setSize(500, 400);
		setLocationRelativeTo(null); 
	}

	public static void main(String[] args) {

		new Lab8_2("���ֲ���");
	}

}
