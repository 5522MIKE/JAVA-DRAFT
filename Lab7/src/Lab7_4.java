
/*模仿Wiodows中的计算器软件，建立一个计算器软件界面，要求大小、颜色、布局等外观尽可能的相似

暂时不要求实现内部功能*/

import java.awt.*;

import javax.swing.*;

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

public class Lab7_4 {

	public static void main(String[] args) {
		new GridFrame("菜鸡计算器");

	}

}
