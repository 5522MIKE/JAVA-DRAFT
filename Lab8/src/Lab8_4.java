import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*ģ��Wiodows�еļ��������������һ��������������棬Ҫ���С����ɫ�����ֵ���۾����ܵ�����

����ֱ��ʹ��ʵ��������ɽ��棩

ʵ�ּ������Ĳ��ֹ��ܣ�Ҫ������ʵ���������������㡣*/
class GridFrame extends JFrame {

	JPanel p = new JPanel(new GridLayout(4, 4, 3, 3));

	JTextArea t = new JTextArea("0", 6, 6);

	String str[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+" };

	public GridFrame(String s) {

		super(s);

		setLayout(new BorderLayout());
		JButton btn[];
		btn = new JButton[str.length];

		for (int i = 0; i < str.length; i++) {

			btn[i] = new JButton(str[i]);

			p.add(btn[i]);

		}
		getContentPane().add(t, BorderLayout.NORTH);

		getContentPane().add(p, BorderLayout.CENTER);
		setVisible(true);

		setSize(500, 700);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

}

public class Lab8_4 {

	public static void main(String[] args) {
		new GridFrame("�˼�������");

	}

}